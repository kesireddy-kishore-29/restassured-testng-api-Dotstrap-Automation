# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-3eb29053-c82f-4d19-a607-c0b57e0e2188` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-ac3ca1b6-ac3d-4dd9-80c1-7138fa60dca4` |
| 3 | `POST /v1/auth/token` | 200 | 64 | `qa-70631a66-8f46-4ef3-a946-50cfc0ea5185` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-06fa6296-0455-4c33-9d5c-76c088c6b9e8` |
| 5 | `GET /v1/conversations/{id}` | 503 | 16 | `qa-4b8a8971-a1d6-4987-9bac-a0eddc1a21fa` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-80da008f-9a9a-4f0c-b13c-e10dea34ad54` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-e14bc69d-d358-4d77-acaa-35bf263352a7` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-d4051ac5-6119-4bb4-9a52-0e1fe8091982` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-f22b7591-04c0-4c65-bb53-fda18c69ccf6` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-984621f9-9855-42c5-9550-79520627d2c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3eb29053-c82f-4d19-a607-c0b57e0e2188

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eb29053-c82f-4d19-a607-c0b57e0e2188
Content-Type: application/json

--- request body ---
{"handle":"qa-d631ddbdf79b","displayName":"QA d631ddbdf79b","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eb29053-c82f-4d19-a607-c0b57e0e2188
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Location: /v1/accounts/qa-d631ddbdf79b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af7dc56e-6ae1-46de-b940-44fab7c4035a","handle":"qa-d631ddbdf79b","displayName":"QA d631ddbdf79b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.556088153Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ac3ca1b6-ac3d-4dd9-80c1-7138fa60dca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac3ca1b6-ac3d-4dd9-80c1-7138fa60dca4
Content-Type: application/json

--- request body ---
{"handle":"qa-f0feb8332cd4","displayName":"QA f0feb8332cd4","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac3ca1b6-ac3d-4dd9-80c1-7138fa60dca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Location: /v1/accounts/qa-f0feb8332cd4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8624ccac-1d85-468d-bb1b-dd30f7654f80","handle":"qa-f0feb8332cd4","displayName":"QA f0feb8332cd4","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.624151773Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-70631a66-8f46-4ef3-a946-50cfc0ea5185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70631a66-8f46-4ef3-a946-50cfc0ea5185
Content-Type: application/json

--- request body ---
{"handle":"qa-d631ddbdf79b","password":"****"}

--- response: 200 in 64 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-70631a66-8f46-4ef3-a946-50cfc0ea5185
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af7dc56e-6ae1-46de-b940-44fab7c4035a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-06fa6296-0455-4c33-9d5c-76c088c6b9e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06fa6296-0455-4c33-9d5c-76c088c6b9e8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f0feb8332cd4","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-06fa6296-0455-4c33-9d5c-76c088c6b9e8
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
Location: /v1/conversations/cnv_70a29955-5042-4b7c-8746-e6400dbca560
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_70a29955-5042-4b7c-8746-e6400dbca560","subject":"Error contract","status":"open","region":"eu","participants":["qa-d631ddbdf79b","qa-f0feb8332cd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.755739901Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_70a29955-5042-4b7c-8746-e6400dbca560
correlation: qa-4b8a8971-a1d6-4987-9bac-a0eddc1a21fa

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8b366423-ea77-44bc-90a4-4c2f246d3843
X-Correlation-Id: qa-4b8a8971-a1d6-4987-9bac-a0eddc1a21fa
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b8a8971-a1d6-4987-9bac-a0eddc1a21fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_70a29955-5042-4b7c-8746-e6400dbca560","correlationId":"qa-4b8a8971-a1d6-4987-9bac-a0eddc1a21fa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-80da008f-9a9a-4f0c-b13c-e10dea34ad54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80da008f-9a9a-4f0c-b13c-e10dea34ad54
Content-Type: application/json

--- request body ---
{"handle":"qa-f0feb8332cd4","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-80da008f-9a9a-4f0c-b13c-e10dea34ad54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8624ccac-1d85-468d-bb1b-dd30f7654f80"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e14bc69d-d358-4d77-acaa-35bf263352a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e14bc69d-d358-4d77-acaa-35bf263352a7
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e14bc69d-d358-4d77-acaa-35bf263352a7
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
correlation: qa-d4051ac5-6119-4bb4-9a52-0e1fe8091982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4051ac5-6119-4bb4-9a52-0e1fe8091982
Content-Type: application/json

--- request body ---
{"handle":"qa-f0feb8332cd4","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4051ac5-6119-4bb4-9a52-0e1fe8091982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4051ac5-6119-4bb4-9a52-0e1fe8091982"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f22b7591-04c0-4c65-bb53-fda18c69ccf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f22b7591-04c0-4c65-bb53-fda18c69ccf6
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f22b7591-04c0-4c65-bb53-fda18c69ccf6
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
correlation: qa-984621f9-9855-42c5-9550-79520627d2c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-984621f9-9855-42c5-9550-79520627d2c6
Content-Type: application/json

--- request body ---
{"handle":"qa-d631ddbdf79b","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-984621f9-9855-42c5-9550-79520627d2c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-984621f9-9855-42c5-9550-79520627d2c6"}
```
