# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 313 | `qa-88ee49f8-c53d-44e3-9b41-a449fae91e6d` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-73e8b6df-8b24-4e6a-9897-d70dc9ec8cfb` |
| 3 | `GET /v1/accounts/me` | 200 | 11 | `qa-2b772ca6-32a8-4de6-84bc-6cdd8cb09c32` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-63d75fa3-7c4c-41c5-a37e-f95d81b2be44` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-b01633e2-b4cc-4866-b4b8-096770ec7037` |
| 6 | `GET /v1/accounts/me` | 401 | 5 | `qa-acedd607-413b-4a3b-ac18-9385a935ccbd` |
| 7 | `GET /v1/accounts/me` | 401 | 4 | `qa-e66579f4-ad5d-4395-a151-a5e440eb2c46` |
| 8 | `POST /v1/auth/token` | 200 | 8 | `qa-12832bb0-7a43-4235-a0e9-1af2298ab8d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9f348cb6-d5cd-436e-9e0d-fabe29917498` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-bb19dd61-56af-4142-9312-164004e9e9ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88ee49f8-c53d-44e3-9b41-a449fae91e6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88ee49f8-c53d-44e3-9b41-a449fae91e6d
Content-Type: application/json

--- request body ---
{"handle":"qa-376f9279b2ea","displayName":"QA 376f9279b2ea","password":"****","region":"eu"}

--- response: 201 in 313 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-88ee49f8-c53d-44e3-9b41-a449fae91e6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-376f9279b2ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dde3cc83-8637-435c-9e53-8c7a3d98d4c3","handle":"qa-376f9279b2ea","displayName":"QA 376f9279b2ea","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.807902931Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-73e8b6df-8b24-4e6a-9897-d70dc9ec8cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73e8b6df-8b24-4e6a-9897-d70dc9ec8cfb
Content-Type: application/json

--- request body ---
{"handle":"qa-376f9279b2ea","password":"****","ttlSeconds":1}

--- response: 200 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-73e8b6df-8b24-4e6a-9897-d70dc9ec8cfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_dde3cc83-8637-435c-9e53-8c7a3d98d4c3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b772ca6-32a8-4de6-84bc-6cdd8cb09c32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b772ca6-32a8-4de6-84bc-6cdd8cb09c32
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b772ca6-32a8-4de6-84bc-6cdd8cb09c32
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
Content-Length: 181

{"id":"acc_dde3cc83-8637-435c-9e53-8c7a3d98d4c3","handle":"qa-376f9279b2ea","displayName":"QA 376f9279b2ea","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.807902931Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-63d75fa3-7c4c-41c5-a37e-f95d81b2be44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63d75fa3-7c4c-41c5-a37e-f95d81b2be44
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-63d75fa3-7c4c-41c5-a37e-f95d81b2be44
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
Content-Length: 181

{"id":"acc_dde3cc83-8637-435c-9e53-8c7a3d98d4c3","handle":"qa-376f9279b2ea","displayName":"QA 376f9279b2ea","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.807902931Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b01633e2-b4cc-4866-b4b8-096770ec7037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b01633e2-b4cc-4866-b4b8-096770ec7037
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b01633e2-b4cc-4866-b4b8-096770ec7037
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
Content-Length: 181

{"id":"acc_dde3cc83-8637-435c-9e53-8c7a3d98d4c3","handle":"qa-376f9279b2ea","displayName":"QA 376f9279b2ea","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.807902931Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-acedd607-413b-4a3b-ac18-9385a935ccbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acedd607-413b-4a3b-ac18-9385a935ccbd
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acedd607-413b-4a3b-ac18-9385a935ccbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-acedd607-413b-4a3b-ac18-9385a935ccbd"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-e66579f4-ad5d-4395-a151-a5e440eb2c46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e66579f4-ad5d-4395-a151-a5e440eb2c46
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e66579f4-ad5d-4395-a151-a5e440eb2c46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-e66579f4-ad5d-4395-a151-a5e440eb2c46"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-12832bb0-7a43-4235-a0e9-1af2298ab8d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12832bb0-7a43-4235-a0e9-1af2298ab8d7
Content-Type: application/json

--- request body ---
{"handle":"qa-376f9279b2ea","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-12832bb0-7a43-4235-a0e9-1af2298ab8d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dde3cc83-8637-435c-9e53-8c7a3d98d4c3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f348cb6-d5cd-436e-9e0d-fabe29917498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f348cb6-d5cd-436e-9e0d-fabe29917498
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f348cb6-d5cd-436e-9e0d-fabe29917498
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bb19dd61-56af-4142-9312-164004e9e9ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb19dd61-56af-4142-9312-164004e9e9ee
Content-Type: application/json

--- request body ---
{"handle":"qa-376f9279b2ea","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb19dd61-56af-4142-9312-164004e9e9ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb19dd61-56af-4142-9312-164004e9e9ee"}
```
