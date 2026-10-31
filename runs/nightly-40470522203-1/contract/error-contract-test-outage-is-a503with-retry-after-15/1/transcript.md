# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-ca33b228-d033-4516-8267-9d943d8a792d` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-578c0aba-d0bc-4eae-962c-6367f120c8b8` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-4b53b353-211d-4a40-88c1-5ad518dcb141` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-2b17a6c7-343e-4a84-a3c9-4067018ca9e4` |
| 5 | `POST /v1/credits/purchases` | 503 | 27 | `qa-47bf5b4c-8f6d-46c0-b026-7315be90458d` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-fe7e52f4-77f0-4e90-9ee3-631a371797ec` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-730a3a2c-f8d0-4dca-b8ee-2b5deaaa1e59` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-ebc4c9d9-9c1a-4901-a593-4e42bba86f6d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1e6bf8ea-aa83-4020-814e-6c340d63973e` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-849cc4be-7efe-4c11-a40f-044663914106` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca33b228-d033-4516-8267-9d943d8a792d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca33b228-d033-4516-8267-9d943d8a792d
Content-Type: application/json

--- request body ---
{"handle":"qa-ac54401cc19d","displayName":"QA ac54401cc19d","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca33b228-d033-4516-8267-9d943d8a792d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Location: /v1/accounts/qa-ac54401cc19d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c467c4a8-3d0b-49e8-8cee-7a772bcae66f","handle":"qa-ac54401cc19d","displayName":"QA ac54401cc19d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.361742438Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-578c0aba-d0bc-4eae-962c-6367f120c8b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-578c0aba-d0bc-4eae-962c-6367f120c8b8
Content-Type: application/json

--- request body ---
{"handle":"qa-59e39f3311ef","displayName":"QA 59e39f3311ef","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-578c0aba-d0bc-4eae-962c-6367f120c8b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Location: /v1/accounts/qa-59e39f3311ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99cc5f1b-d554-4418-8bc0-b23efba4f805","handle":"qa-59e39f3311ef","displayName":"QA 59e39f3311ef","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.397990783Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4b53b353-211d-4a40-88c1-5ad518dcb141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b53b353-211d-4a40-88c1-5ad518dcb141
Content-Type: application/json

--- request body ---
{"handle":"qa-ac54401cc19d","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b53b353-211d-4a40-88c1-5ad518dcb141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c467c4a8-3d0b-49e8-8cee-7a772bcae66f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2b17a6c7-343e-4a84-a3c9-4067018ca9e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b17a6c7-343e-4a84-a3c9-4067018ca9e4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-59e39f3311ef","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b17a6c7-343e-4a84-a3c9-4067018ca9e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_d7097b89-75ec-42af-aa7d-1c7a83513e9a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d7097b89-75ec-42af-aa7d-1c7a83513e9a","subject":"Error contract","status":"open","region":"eu","participants":["qa-ac54401cc19d","qa-59e39f3311ef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.479053287Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-47bf5b4c-8f6d-46c0-b026-7315be90458d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 91010a8f-1f38-4bf2-a0c6-829014323dbc
Idempotency-Key: qa-89bcb7816e274cc28231117e0ff57952
X-Correlation-Id: qa-47bf5b4c-8f6d-46c0-b026-7315be90458d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47bf5b4c-8f6d-46c0-b026-7315be90458d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-47bf5b4c-8f6d-46c0-b026-7315be90458d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fe7e52f4-77f0-4e90-9ee3-631a371797ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe7e52f4-77f0-4e90-9ee3-631a371797ec
Content-Type: application/json

--- request body ---
{"handle":"qa-59e39f3311ef","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe7e52f4-77f0-4e90-9ee3-631a371797ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99cc5f1b-d554-4418-8bc0-b23efba4f805"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-730a3a2c-f8d0-4dca-b8ee-2b5deaaa1e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-730a3a2c-f8d0-4dca-b8ee-2b5deaaa1e59
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-730a3a2c-f8d0-4dca-b8ee-2b5deaaa1e59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ebc4c9d9-9c1a-4901-a593-4e42bba86f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebc4c9d9-9c1a-4901-a593-4e42bba86f6d
Content-Type: application/json

--- request body ---
{"handle":"qa-59e39f3311ef","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebc4c9d9-9c1a-4901-a593-4e42bba86f6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebc4c9d9-9c1a-4901-a593-4e42bba86f6d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e6bf8ea-aa83-4020-814e-6c340d63973e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e6bf8ea-aa83-4020-814e-6c340d63973e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e6bf8ea-aa83-4020-814e-6c340d63973e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-849cc4be-7efe-4c11-a40f-044663914106

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-849cc4be-7efe-4c11-a40f-044663914106
Content-Type: application/json

--- request body ---
{"handle":"qa-ac54401cc19d","password":"****"}

--- response: 401 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-849cc4be-7efe-4c11-a40f-044663914106
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-849cc4be-7efe-4c11-a40f-044663914106"}
```
