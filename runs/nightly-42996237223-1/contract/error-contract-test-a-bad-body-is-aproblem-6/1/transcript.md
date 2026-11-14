# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 62 | `qa-68eb37dd-3ab1-4f3b-8824-884db7f63d01` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-7b395bc3-6b9a-47e4-b83d-96e913e28e2d` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-9a9ad178-c7fb-49b8-80e0-79b949565d27` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-a5b09813-6e05-4fa8-822d-86d7d3a927f1` |
| 5 | `PATCH /v1/accounts/me` | 400 | 10 | `qa-6d1b9782-d109-48de-a1ac-7faa9242080e` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-b905411b-fe9e-4b70-8c10-b6a58e52de03` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-a1265346-64cc-4ed5-94fc-632d05cc8ea8` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-d5dc68ea-dc33-45e6-a1c4-401f0eb699a4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b326d3e4-9663-4327-afc8-1f13c1a264d5` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-94fc2d74-f661-49b4-b43d-1eda66bfbd93` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68eb37dd-3ab1-4f3b-8824-884db7f63d01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68eb37dd-3ab1-4f3b-8824-884db7f63d01
Content-Type: application/json

--- request body ---
{"handle":"qa-a8631212e370","displayName":"QA a8631212e370","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-68eb37dd-3ab1-4f3b-8824-884db7f63d01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-a8631212e370
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a2fd456-6659-4f43-bed4-4900fd2654e4","handle":"qa-a8631212e370","displayName":"QA a8631212e370","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.637072912Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7b395bc3-6b9a-47e4-b83d-96e913e28e2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b395bc3-6b9a-47e4-b83d-96e913e28e2d
Content-Type: application/json

--- request body ---
{"handle":"qa-c2e83dbf56ba","displayName":"QA c2e83dbf56ba","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b395bc3-6b9a-47e4-b83d-96e913e28e2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-c2e83dbf56ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1702e8d6-4ec0-490e-9392-7a5af6a86ab5","handle":"qa-c2e83dbf56ba","displayName":"QA c2e83dbf56ba","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.688366888Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9a9ad178-c7fb-49b8-80e0-79b949565d27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a9ad178-c7fb-49b8-80e0-79b949565d27
Content-Type: application/json

--- request body ---
{"handle":"qa-a8631212e370","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a9ad178-c7fb-49b8-80e0-79b949565d27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a2fd456-6659-4f43-bed4-4900fd2654e4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a5b09813-6e05-4fa8-822d-86d7d3a927f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b09813-6e05-4fa8-822d-86d7d3a927f1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2e83dbf56ba","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5b09813-6e05-4fa8-822d-86d7d3a927f1
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
Location: /v1/conversations/cnv_f076b17e-bdea-464b-b99f-6e88bb046474
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f076b17e-bdea-464b-b99f-6e88bb046474","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8631212e370","qa-c2e83dbf56ba"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.809085355Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6d1b9782-d109-48de-a1ac-7faa9242080e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d1b9782-d109-48de-a1ac-7faa9242080e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d1b9782-d109-48de-a1ac-7faa9242080e
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-6d1b9782-d109-48de-a1ac-7faa9242080e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b905411b-fe9e-4b70-8c10-b6a58e52de03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b905411b-fe9e-4b70-8c10-b6a58e52de03
Content-Type: application/json

--- request body ---
{"handle":"qa-c2e83dbf56ba","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b905411b-fe9e-4b70-8c10-b6a58e52de03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1702e8d6-4ec0-490e-9392-7a5af6a86ab5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1265346-64cc-4ed5-94fc-632d05cc8ea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1265346-64cc-4ed5-94fc-632d05cc8ea8
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1265346-64cc-4ed5-94fc-632d05cc8ea8
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
correlation: qa-d5dc68ea-dc33-45e6-a1c4-401f0eb699a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5dc68ea-dc33-45e6-a1c4-401f0eb699a4
Content-Type: application/json

--- request body ---
{"handle":"qa-c2e83dbf56ba","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5dc68ea-dc33-45e6-a1c4-401f0eb699a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5dc68ea-dc33-45e6-a1c4-401f0eb699a4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b326d3e4-9663-4327-afc8-1f13c1a264d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b326d3e4-9663-4327-afc8-1f13c1a264d5
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b326d3e4-9663-4327-afc8-1f13c1a264d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-94fc2d74-f661-49b4-b43d-1eda66bfbd93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94fc2d74-f661-49b4-b43d-1eda66bfbd93
Content-Type: application/json

--- request body ---
{"handle":"qa-a8631212e370","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94fc2d74-f661-49b4-b43d-1eda66bfbd93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94fc2d74-f661-49b4-b43d-1eda66bfbd93"}
```
