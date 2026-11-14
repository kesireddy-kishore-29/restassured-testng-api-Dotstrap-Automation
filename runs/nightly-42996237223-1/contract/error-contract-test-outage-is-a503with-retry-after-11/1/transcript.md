# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-53518361-07c4-4f16-be81-24bd508359b5` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-77d0e5be-c0a5-4120-9d0c-d8e48c6bed93` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-c1bb1e28-8aa4-4717-8182-61c23d0cb614` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-66a6d9cc-20bb-4bdc-949c-4a86351b56b4` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 25 | `qa-29e12f6f-f86d-429b-b34c-0b6d289e7b9a` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-008122d1-90a1-4152-b577-66b5459f30dc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2c92d326-2b54-4787-9e79-79c3560dcb0d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-d392b9a7-4f99-4129-a16c-f24c2c6b53cc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-137ef6bb-e7ed-42d2-b8b1-2eb50f649e3c` |
| 10 | `POST /v1/auth/token` | 401 | 45 | `qa-41c3f8d2-18cf-47ee-aa9b-ec0b1af4b782` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53518361-07c4-4f16-be81-24bd508359b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53518361-07c4-4f16-be81-24bd508359b5
Content-Type: application/json

--- request body ---
{"handle":"qa-0625a1b5e3a0","displayName":"QA 0625a1b5e3a0","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-53518361-07c4-4f16-be81-24bd508359b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-0625a1b5e3a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d61d807-a204-4442-80d7-db92c73209cf","handle":"qa-0625a1b5e3a0","displayName":"QA 0625a1b5e3a0","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.297434059Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-77d0e5be-c0a5-4120-9d0c-d8e48c6bed93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77d0e5be-c0a5-4120-9d0c-d8e48c6bed93
Content-Type: application/json

--- request body ---
{"handle":"qa-8c5bf9d97d1c","displayName":"QA 8c5bf9d97d1c","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-77d0e5be-c0a5-4120-9d0c-d8e48c6bed93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Location: /v1/accounts/qa-8c5bf9d97d1c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1873d9d-a957-451f-973b-6977ee23c3e3","handle":"qa-8c5bf9d97d1c","displayName":"QA 8c5bf9d97d1c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.361884753Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1bb1e28-8aa4-4717-8182-61c23d0cb614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1bb1e28-8aa4-4717-8182-61c23d0cb614
Content-Type: application/json

--- request body ---
{"handle":"qa-0625a1b5e3a0","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1bb1e28-8aa4-4717-8182-61c23d0cb614
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d61d807-a204-4442-80d7-db92c73209cf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-66a6d9cc-20bb-4bdc-949c-4a86351b56b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a6d9cc-20bb-4bdc-949c-4a86351b56b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c5bf9d97d1c","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a6d9cc-20bb-4bdc-949c-4a86351b56b4
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
Location: /v1/conversations/cnv_312fe0cb-06f8-4725-b7f1-c1d2e0051f35
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_312fe0cb-06f8-4725-b7f1-c1d2e0051f35","subject":"Error contract","status":"open","region":"eu","participants":["qa-0625a1b5e3a0","qa-8c5bf9d97d1c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.444817007Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_312fe0cb-06f8-4725-b7f1-c1d2e0051f35/read
correlation: qa-29e12f6f-f86d-429b-b34c-0b6d289e7b9a

--- request headers ---
Accept: application/json
X-Fault-Key: e23ec5bc-7481-4cd0-8b9d-3eb8dc2667b4
X-Fault: unavailable-once
X-Correlation-Id: qa-29e12f6f-f86d-429b-b34c-0b6d289e7b9a
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29e12f6f-f86d-429b-b34c-0b6d289e7b9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_312fe0cb-06f8-4725-b7f1-c1d2e0051f35/read","correlationId":"qa-29e12f6f-f86d-429b-b34c-0b6d289e7b9a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-008122d1-90a1-4152-b577-66b5459f30dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-008122d1-90a1-4152-b577-66b5459f30dc
Content-Type: application/json

--- request body ---
{"handle":"qa-8c5bf9d97d1c","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-008122d1-90a1-4152-b577-66b5459f30dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1873d9d-a957-451f-973b-6977ee23c3e3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c92d326-2b54-4787-9e79-79c3560dcb0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c92d326-2b54-4787-9e79-79c3560dcb0d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c92d326-2b54-4787-9e79-79c3560dcb0d
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
correlation: qa-d392b9a7-4f99-4129-a16c-f24c2c6b53cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d392b9a7-4f99-4129-a16c-f24c2c6b53cc
Content-Type: application/json

--- request body ---
{"handle":"qa-8c5bf9d97d1c","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d392b9a7-4f99-4129-a16c-f24c2c6b53cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d392b9a7-4f99-4129-a16c-f24c2c6b53cc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-137ef6bb-e7ed-42d2-b8b1-2eb50f649e3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-137ef6bb-e7ed-42d2-b8b1-2eb50f649e3c
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-137ef6bb-e7ed-42d2-b8b1-2eb50f649e3c
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
correlation: qa-41c3f8d2-18cf-47ee-aa9b-ec0b1af4b782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41c3f8d2-18cf-47ee-aa9b-ec0b1af4b782
Content-Type: application/json

--- request body ---
{"handle":"qa-0625a1b5e3a0","password":"****"}

--- response: 401 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41c3f8d2-18cf-47ee-aa9b-ec0b1af4b782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-41c3f8d2-18cf-47ee-aa9b-ec0b1af4b782"}
```
