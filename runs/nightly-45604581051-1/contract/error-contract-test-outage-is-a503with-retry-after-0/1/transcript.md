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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-aa5021b5-af31-4f7d-af54-38fa1fddb41f` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-3a6164d4-ce04-4219-8a6f-6655a65ec803` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-efb9cf5f-535d-484b-b717-a696495ae949` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-8f3596eb-9782-4473-9278-3ddd24b79b40` |
| 5 | `POST /v1/auth/token` | 503 | 12 | `qa-7ad9fd92-d9e7-4ba2-933b-6e9a1b32aad0` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-9a6994fb-9a04-4be1-884e-d5e0ad73d966` |
| 7 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-414b036d-fbff-4cb6-9ba1-e6796af9f3d6` |
| 8 | `POST /v1/auth/token` | 401 | 50 | `qa-dce0008d-3bb7-4b20-ae44-5907e9eb6d75` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-cbe81f7e-a703-4303-9940-a01d4e935a02` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-cb1f7b9b-9ff5-47b7-8bb6-598ddbdfcba2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa5021b5-af31-4f7d-af54-38fa1fddb41f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa5021b5-af31-4f7d-af54-38fa1fddb41f
Content-Type: application/json

--- request body ---
{"handle":"qa-75e6ac5cfa41","displayName":"QA 75e6ac5cfa41","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa5021b5-af31-4f7d-af54-38fa1fddb41f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-75e6ac5cfa41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb6a970d-d5b2-4720-952a-3580cf5cdcf9","handle":"qa-75e6ac5cfa41","displayName":"QA 75e6ac5cfa41","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.199849751Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a6164d4-ce04-4219-8a6f-6655a65ec803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a6164d4-ce04-4219-8a6f-6655a65ec803
Content-Type: application/json

--- request body ---
{"handle":"qa-4dd7dc4b85a8","displayName":"QA 4dd7dc4b85a8","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a6164d4-ce04-4219-8a6f-6655a65ec803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-4dd7dc4b85a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc323e3a-057d-49b8-ba94-4599d8bf2efa","handle":"qa-4dd7dc4b85a8","displayName":"QA 4dd7dc4b85a8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.236069006Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-efb9cf5f-535d-484b-b717-a696495ae949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb9cf5f-535d-484b-b717-a696495ae949
Content-Type: application/json

--- request body ---
{"handle":"qa-75e6ac5cfa41","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-efb9cf5f-535d-484b-b717-a696495ae949
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb6a970d-d5b2-4720-952a-3580cf5cdcf9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f3596eb-9782-4473-9278-3ddd24b79b40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3596eb-9782-4473-9278-3ddd24b79b40
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4dd7dc4b85a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f3596eb-9782-4473-9278-3ddd24b79b40
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
Location: /v1/conversations/cnv_a40c5308-81a1-4958-b27e-9f3990c06934
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a40c5308-81a1-4958-b27e-9f3990c06934","subject":"Error contract","status":"open","region":"eu","participants":["qa-75e6ac5cfa41","qa-4dd7dc4b85a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.303322803Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7ad9fd92-d9e7-4ba2-933b-6e9a1b32aad0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d99edde0-5b84-4ae3-b316-0bee604a7fa5
X-Correlation-Id: qa-7ad9fd92-d9e7-4ba2-933b-6e9a1b32aad0
Content-Type: application/json

--- request body ---
{"handle":"qa-75e6ac5cfa41","password":"****"}

--- response: 503 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ad9fd92-d9e7-4ba2-933b-6e9a1b32aad0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-7ad9fd92-d9e7-4ba2-933b-6e9a1b32aad0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9a6994fb-9a04-4be1-884e-d5e0ad73d966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6994fb-9a04-4be1-884e-d5e0ad73d966
Content-Type: application/json

--- request body ---
{"handle":"qa-4dd7dc4b85a8","password":"****"}

--- response: 200 in 57 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6994fb-9a04-4be1-884e-d5e0ad73d966
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc323e3a-057d-49b8-ba94-4599d8bf2efa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-414b036d-fbff-4cb6-9ba1-e6796af9f3d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-414b036d-fbff-4cb6-9ba1-e6796af9f3d6
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-414b036d-fbff-4cb6-9ba1-e6796af9f3d6
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
correlation: qa-dce0008d-3bb7-4b20-ae44-5907e9eb6d75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce0008d-3bb7-4b20-ae44-5907e9eb6d75
Content-Type: application/json

--- request body ---
{"handle":"qa-4dd7dc4b85a8","password":"****"}

--- response: 401 in 50 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dce0008d-3bb7-4b20-ae44-5907e9eb6d75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dce0008d-3bb7-4b20-ae44-5907e9eb6d75"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cbe81f7e-a703-4303-9940-a01d4e935a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe81f7e-a703-4303-9940-a01d4e935a02
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cbe81f7e-a703-4303-9940-a01d4e935a02
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
correlation: qa-cb1f7b9b-9ff5-47b7-8bb6-598ddbdfcba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb1f7b9b-9ff5-47b7-8bb6-598ddbdfcba2
Content-Type: application/json

--- request body ---
{"handle":"qa-75e6ac5cfa41","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb1f7b9b-9ff5-47b7-8bb6-598ddbdfcba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb1f7b9b-9ff5-47b7-8bb6-598ddbdfcba2"}
```
