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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-31a5b89d-9b52-444f-89ad-9c94736d2b01` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-de8bc2fa-3739-42ba-948d-4787e8098b12` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-8d824d88-73f4-4bc4-80d2-45eb3da3d304` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-7489423b-327f-4ade-8a1b-426ebfe80319` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 40 | `qa-ce5891ba-5213-493a-86c1-13c6214ecbcd` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-75a79aff-7b0c-4374-a1a0-708870d4d3d9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-368701c5-0f68-47b0-90c0-ecc792b64e56` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-31ba81e2-a4e2-40b1-9555-e7d1f85b2e0b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-08052f08-c9b7-4738-af62-1b3acba150f5` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-40b2b603-35ca-44db-95fc-a3f0c77f2424` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-31a5b89d-9b52-444f-89ad-9c94736d2b01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a5b89d-9b52-444f-89ad-9c94736d2b01
Content-Type: application/json

--- request body ---
{"handle":"qa-46624020e318","displayName":"QA 46624020e318","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a5b89d-9b52-444f-89ad-9c94736d2b01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-46624020e318
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b895ba28-a4dc-4c6f-b234-d9f71e9b439a","handle":"qa-46624020e318","displayName":"QA 46624020e318","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.153150388Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-de8bc2fa-3739-42ba-948d-4787e8098b12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8bc2fa-3739-42ba-948d-4787e8098b12
Content-Type: application/json

--- request body ---
{"handle":"qa-c162663534c6","displayName":"QA c162663534c6","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-de8bc2fa-3739-42ba-948d-4787e8098b12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Location: /v1/accounts/qa-c162663534c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27ee9ac4-f30c-46ee-9b70-3814017b8556","handle":"qa-c162663534c6","displayName":"QA c162663534c6","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.203397280Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8d824d88-73f4-4bc4-80d2-45eb3da3d304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d824d88-73f4-4bc4-80d2-45eb3da3d304
Content-Type: application/json

--- request body ---
{"handle":"qa-46624020e318","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d824d88-73f4-4bc4-80d2-45eb3da3d304
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b895ba28-a4dc-4c6f-b234-d9f71e9b439a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7489423b-327f-4ade-8a1b-426ebfe80319

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7489423b-327f-4ade-8a1b-426ebfe80319
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c162663534c6","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7489423b-327f-4ade-8a1b-426ebfe80319
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
Location: /v1/conversations/cnv_231c30ed-8f51-488f-ace6-4f08a5d0139c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_231c30ed-8f51-488f-ace6-4f08a5d0139c","subject":"Error contract","status":"open","region":"eu","participants":["qa-46624020e318","qa-c162663534c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.289374992Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_231c30ed-8f51-488f-ace6-4f08a5d0139c/read
correlation: qa-ce5891ba-5213-493a-86c1-13c6214ecbcd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b6fb1932-1f80-41d6-aa1c-806c115c0c0c
X-Correlation-Id: qa-ce5891ba-5213-493a-86c1-13c6214ecbcd
Content-Type: application/json

--- response: 503 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce5891ba-5213-493a-86c1-13c6214ecbcd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_231c30ed-8f51-488f-ace6-4f08a5d0139c/read","correlationId":"qa-ce5891ba-5213-493a-86c1-13c6214ecbcd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-75a79aff-7b0c-4374-a1a0-708870d4d3d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a79aff-7b0c-4374-a1a0-708870d4d3d9
Content-Type: application/json

--- request body ---
{"handle":"qa-c162663534c6","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-75a79aff-7b0c-4374-a1a0-708870d4d3d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27ee9ac4-f30c-46ee-9b70-3814017b8556"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-368701c5-0f68-47b0-90c0-ecc792b64e56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-368701c5-0f68-47b0-90c0-ecc792b64e56
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-368701c5-0f68-47b0-90c0-ecc792b64e56
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
correlation: qa-31ba81e2-a4e2-40b1-9555-e7d1f85b2e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ba81e2-a4e2-40b1-9555-e7d1f85b2e0b
Content-Type: application/json

--- request body ---
{"handle":"qa-c162663534c6","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31ba81e2-a4e2-40b1-9555-e7d1f85b2e0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31ba81e2-a4e2-40b1-9555-e7d1f85b2e0b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08052f08-c9b7-4738-af62-1b3acba150f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08052f08-c9b7-4738-af62-1b3acba150f5
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08052f08-c9b7-4738-af62-1b3acba150f5
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
correlation: qa-40b2b603-35ca-44db-95fc-a3f0c77f2424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40b2b603-35ca-44db-95fc-a3f0c77f2424
Content-Type: application/json

--- request body ---
{"handle":"qa-46624020e318","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40b2b603-35ca-44db-95fc-a3f0c77f2424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40b2b603-35ca-44db-95fc-a3f0c77f2424"}
```
