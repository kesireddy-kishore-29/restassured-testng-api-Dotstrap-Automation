# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-ad64aaeb-fa7f-44e9-9776-854372bc6fe6` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-ddcc927d-9339-4541-a52f-10fb93eff511` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-e4a01eac-edf2-4798-9667-56557900e60b` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-43e59491-a27a-4187-9c5b-eeca76edaa80` |
| 5 | `GET /v1/admin/stats` | 503 | 13 | `qa-5b888365-8fa0-4f73-b60d-47ced119abe3` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-80ea7dfe-ab75-457a-9ad6-c389b574c389` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5fef1555-24fe-42f2-9211-2ab657814efc` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-cca74ea6-0291-4d06-a9a2-512e88dc71f1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-312ff3cb-e0c7-4d2b-a2fa-5e6b82faf7ff` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-11e64a74-468d-4987-a3c3-2e6761b62fc9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ad64aaeb-fa7f-44e9-9776-854372bc6fe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad64aaeb-fa7f-44e9-9776-854372bc6fe6
Content-Type: application/json

--- request body ---
{"handle":"qa-5b7a5972122e","displayName":"QA 5b7a5972122e","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad64aaeb-fa7f-44e9-9776-854372bc6fe6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Location: /v1/accounts/qa-5b7a5972122e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8beae3ad-0bd6-499b-8055-bbcc3936c59a","handle":"qa-5b7a5972122e","displayName":"QA 5b7a5972122e","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.087490910Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ddcc927d-9339-4541-a52f-10fb93eff511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddcc927d-9339-4541-a52f-10fb93eff511
Content-Type: application/json

--- request body ---
{"handle":"qa-abdda6d32d8a","displayName":"QA abdda6d32d8a","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddcc927d-9339-4541-a52f-10fb93eff511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Location: /v1/accounts/qa-abdda6d32d8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31967bbf-3d9c-4698-9e64-3cb6bf129c21","handle":"qa-abdda6d32d8a","displayName":"QA abdda6d32d8a","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.115960671Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e4a01eac-edf2-4798-9667-56557900e60b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4a01eac-edf2-4798-9667-56557900e60b
Content-Type: application/json

--- request body ---
{"handle":"qa-5b7a5972122e","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4a01eac-edf2-4798-9667-56557900e60b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8beae3ad-0bd6-499b-8055-bbcc3936c59a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-43e59491-a27a-4187-9c5b-eeca76edaa80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e59491-a27a-4187-9c5b-eeca76edaa80
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-abdda6d32d8a","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-43e59491-a27a-4187-9c5b-eeca76edaa80
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
Location: /v1/conversations/cnv_a75de841-3d8e-4dc3-be0f-50a82182cc87
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a75de841-3d8e-4dc3-be0f-50a82182cc87","subject":"Error contract","status":"open","region":"eu","participants":["qa-5b7a5972122e","qa-abdda6d32d8a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:39.178641172Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-5b888365-8fa0-4f73-b60d-47ced119abe3

--- request headers ---
Accept: application/json
X-Fault-Key: bd18b172-2de2-4a7e-a976-79773cfbd3cb
X-Fault: unavailable-once
X-Correlation-Id: qa-5b888365-8fa0-4f73-b60d-47ced119abe3
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b888365-8fa0-4f73-b60d-47ced119abe3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-5b888365-8fa0-4f73-b60d-47ced119abe3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-80ea7dfe-ab75-457a-9ad6-c389b574c389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80ea7dfe-ab75-457a-9ad6-c389b574c389
Content-Type: application/json

--- request body ---
{"handle":"qa-abdda6d32d8a","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-80ea7dfe-ab75-457a-9ad6-c389b574c389
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31967bbf-3d9c-4698-9e64-3cb6bf129c21"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fef1555-24fe-42f2-9211-2ab657814efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fef1555-24fe-42f2-9211-2ab657814efc
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fef1555-24fe-42f2-9211-2ab657814efc
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
correlation: qa-cca74ea6-0291-4d06-a9a2-512e88dc71f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca74ea6-0291-4d06-a9a2-512e88dc71f1
Content-Type: application/json

--- request body ---
{"handle":"qa-abdda6d32d8a","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cca74ea6-0291-4d06-a9a2-512e88dc71f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cca74ea6-0291-4d06-a9a2-512e88dc71f1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-312ff3cb-e0c7-4d2b-a2fa-5e6b82faf7ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-312ff3cb-e0c7-4d2b-a2fa-5e6b82faf7ff
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-312ff3cb-e0c7-4d2b-a2fa-5e6b82faf7ff
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
correlation: qa-11e64a74-468d-4987-a3c3-2e6761b62fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e64a74-468d-4987-a3c3-2e6761b62fc9
Content-Type: application/json

--- request body ---
{"handle":"qa-5b7a5972122e","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11e64a74-468d-4987-a3c3-2e6761b62fc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11e64a74-468d-4987-a3c3-2e6761b62fc9"}
```
