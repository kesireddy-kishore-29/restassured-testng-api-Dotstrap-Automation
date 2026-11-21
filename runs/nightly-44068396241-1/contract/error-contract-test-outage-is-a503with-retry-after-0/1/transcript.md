# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-63704624-e363-4cdf-84ed-c649c6676641` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-3ce73762-c151-42cd-8429-2ccdc54d19c7` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-ec49e579-7e89-4830-9c88-65b9fce333e9` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-0b8d68cf-f97d-4dad-808a-744ee161390f` |
| 5 | `POST /v1/auth/token` | 503 | 12 | `qa-acd65f6b-5e70-4d8f-a2e5-49228b3b3488` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-46558960-dcbc-4841-b418-8d430bd0c9b0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-882cad39-e4ef-4ed1-94c1-8c2e16b4af32` |
| 8 | `POST /v1/auth/token` | 401 | 46 | `qa-568979a0-38b7-4ddd-b2f7-606e546e9f8b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-38afedf8-27b0-422b-98b6-a54b24a4b231` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-44949d0d-1d57-4b9e-a9df-e5137cfac529` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63704624-e363-4cdf-84ed-c649c6676641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63704624-e363-4cdf-84ed-c649c6676641
Content-Type: application/json

--- request body ---
{"handle":"qa-a079cb74610e","displayName":"QA a079cb74610e","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-63704624-e363-4cdf-84ed-c649c6676641
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-a079cb74610e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d4e3d61-a25e-43c0-97ac-a940c97adcaa","handle":"qa-a079cb74610e","displayName":"QA a079cb74610e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.628607379Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3ce73762-c151-42cd-8429-2ccdc54d19c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce73762-c151-42cd-8429-2ccdc54d19c7
Content-Type: application/json

--- request body ---
{"handle":"qa-bb60dca44965","displayName":"QA bb60dca44965","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ce73762-c151-42cd-8429-2ccdc54d19c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-bb60dca44965
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0eb86c2f-2601-4c40-b0d1-ed1ccf19cdb9","handle":"qa-bb60dca44965","displayName":"QA bb60dca44965","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.678731487Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec49e579-7e89-4830-9c88-65b9fce333e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec49e579-7e89-4830-9c88-65b9fce333e9
Content-Type: application/json

--- request body ---
{"handle":"qa-a079cb74610e","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec49e579-7e89-4830-9c88-65b9fce333e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d4e3d61-a25e-43c0-97ac-a940c97adcaa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0b8d68cf-f97d-4dad-808a-744ee161390f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b8d68cf-f97d-4dad-808a-744ee161390f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bb60dca44965","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b8d68cf-f97d-4dad-808a-744ee161390f
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
Location: /v1/conversations/cnv_21bb4f43-ba48-4d8c-8c8d-8e25e7144e20
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21bb4f43-ba48-4d8c-8c8d-8e25e7144e20","subject":"Error contract","status":"open","region":"eu","participants":["qa-a079cb74610e","qa-bb60dca44965"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.759497533Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-acd65f6b-5e70-4d8f-a2e5-49228b3b3488

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 92622f29-03b3-48e6-be86-ca1237bd2acf
X-Correlation-Id: qa-acd65f6b-5e70-4d8f-a2e5-49228b3b3488
Content-Type: application/json

--- request body ---
{"handle":"qa-a079cb74610e","password":"****"}

--- response: 503 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acd65f6b-5e70-4d8f-a2e5-49228b3b3488
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-acd65f6b-5e70-4d8f-a2e5-49228b3b3488"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46558960-dcbc-4841-b418-8d430bd0c9b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46558960-dcbc-4841-b418-8d430bd0c9b0
Content-Type: application/json

--- request body ---
{"handle":"qa-bb60dca44965","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-46558960-dcbc-4841-b418-8d430bd0c9b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0eb86c2f-2601-4c40-b0d1-ed1ccf19cdb9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-882cad39-e4ef-4ed1-94c1-8c2e16b4af32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-882cad39-e4ef-4ed1-94c1-8c2e16b4af32
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-882cad39-e4ef-4ed1-94c1-8c2e16b4af32
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
correlation: qa-568979a0-38b7-4ddd-b2f7-606e546e9f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-568979a0-38b7-4ddd-b2f7-606e546e9f8b
Content-Type: application/json

--- request body ---
{"handle":"qa-bb60dca44965","password":"****"}

--- response: 401 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-568979a0-38b7-4ddd-b2f7-606e546e9f8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-568979a0-38b7-4ddd-b2f7-606e546e9f8b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38afedf8-27b0-422b-98b6-a54b24a4b231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38afedf8-27b0-422b-98b6-a54b24a4b231
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38afedf8-27b0-422b-98b6-a54b24a4b231
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-44949d0d-1d57-4b9e-a9df-e5137cfac529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44949d0d-1d57-4b9e-a9df-e5137cfac529
Content-Type: application/json

--- request body ---
{"handle":"qa-a079cb74610e","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44949d0d-1d57-4b9e-a9df-e5137cfac529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44949d0d-1d57-4b9e-a9df-e5137cfac529"}
```
