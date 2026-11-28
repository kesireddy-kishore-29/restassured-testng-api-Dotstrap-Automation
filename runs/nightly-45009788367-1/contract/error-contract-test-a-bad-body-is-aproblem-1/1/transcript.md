# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-250bbbfd-2767-4c1c-b0a0-7f00bf964e33` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-027349c1-5416-4edc-a2a7-02e192e4e431` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-9192296c-3d65-4619-a902-b9e8d14e4b09` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-939d8a7a-ecb1-43bd-b148-18fa30bea93e` |
| 5 | `POST /v1/auth/token` | 415 | 36 | `qa-b40a0b12-a54d-40af-b066-4fbddfac1693` |
| 6 | `POST /v1/auth/token` | 200 | 81 | `qa-6f0c1a4f-9f9a-4c40-83e3-5d9d400d008c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1189ecab-b53a-451a-812f-de06a8048942` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-f125cb84-5eff-4c0d-b882-d2c12fae5063` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-0e19749c-7874-41f0-b37e-482f5078d31d` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-fceaf34f-5436-4800-8a3f-419f3699d09d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-250bbbfd-2767-4c1c-b0a0-7f00bf964e33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-250bbbfd-2767-4c1c-b0a0-7f00bf964e33
Content-Type: application/json

--- request body ---
{"handle":"qa-6062fc522413","displayName":"QA 6062fc522413","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-250bbbfd-2767-4c1c-b0a0-7f00bf964e33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-6062fc522413
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43fbf3c6-ac87-473d-a368-b1ea96d0a197","handle":"qa-6062fc522413","displayName":"QA 6062fc522413","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.403687707Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-027349c1-5416-4edc-a2a7-02e192e4e431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-027349c1-5416-4edc-a2a7-02e192e4e431
Content-Type: application/json

--- request body ---
{"handle":"qa-8b02692f833e","displayName":"QA 8b02692f833e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-027349c1-5416-4edc-a2a7-02e192e4e431
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-8b02692f833e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a35cb43-bb15-42d8-961b-2d9f6d5599bf","handle":"qa-8b02692f833e","displayName":"QA 8b02692f833e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.440510051Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9192296c-3d65-4619-a902-b9e8d14e4b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9192296c-3d65-4619-a902-b9e8d14e4b09
Content-Type: application/json

--- request body ---
{"handle":"qa-6062fc522413","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-9192296c-3d65-4619-a902-b9e8d14e4b09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43fbf3c6-ac87-473d-a368-b1ea96d0a197"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-939d8a7a-ecb1-43bd-b148-18fa30bea93e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-939d8a7a-ecb1-43bd-b148-18fa30bea93e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8b02692f833e","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-939d8a7a-ecb1-43bd-b148-18fa30bea93e
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
Location: /v1/conversations/cnv_02e511fb-81ac-4d6d-a64a-1e3a4c40b02f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_02e511fb-81ac-4d6d-a64a-1e3a4c40b02f","subject":"Error contract","status":"open","region":"eu","participants":["qa-6062fc522413","qa-8b02692f833e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.480573839Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b40a0b12-a54d-40af-b066-4fbddfac1693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40a0b12-a54d-40af-b066-4fbddfac1693
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 36 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b40a0b12-a54d-40af-b066-4fbddfac1693
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-b40a0b12-a54d-40af-b066-4fbddfac1693"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6f0c1a4f-9f9a-4c40-83e3-5d9d400d008c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f0c1a4f-9f9a-4c40-83e3-5d9d400d008c
Content-Type: application/json

--- request body ---
{"handle":"qa-8b02692f833e","password":"****"}

--- response: 200 in 81 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f0c1a4f-9f9a-4c40-83e3-5d9d400d008c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a35cb43-bb15-42d8-961b-2d9f6d5599bf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1189ecab-b53a-451a-812f-de06a8048942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1189ecab-b53a-451a-812f-de06a8048942
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1189ecab-b53a-451a-812f-de06a8048942
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
correlation: qa-f125cb84-5eff-4c0d-b882-d2c12fae5063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f125cb84-5eff-4c0d-b882-d2c12fae5063
Content-Type: application/json

--- request body ---
{"handle":"qa-8b02692f833e","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f125cb84-5eff-4c0d-b882-d2c12fae5063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f125cb84-5eff-4c0d-b882-d2c12fae5063"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e19749c-7874-41f0-b37e-482f5078d31d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e19749c-7874-41f0-b37e-482f5078d31d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e19749c-7874-41f0-b37e-482f5078d31d
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
correlation: qa-fceaf34f-5436-4800-8a3f-419f3699d09d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fceaf34f-5436-4800-8a3f-419f3699d09d
Content-Type: application/json

--- request body ---
{"handle":"qa-6062fc522413","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fceaf34f-5436-4800-8a3f-419f3699d09d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fceaf34f-5436-4800-8a3f-419f3699d09d"}
```
