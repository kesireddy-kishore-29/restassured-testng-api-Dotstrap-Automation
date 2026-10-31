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
| 1 | `POST /v1/accounts` | 201 | 476 | `qa-21c9609b-5966-4950-8b7f-4fd33d3a7eaa` |
| 2 | `POST /v1/auth/token` | 200 | 73 | `qa-1cbe397e-2302-40e6-a8e9-5a0476d84846` |
| 3 | `GET /v1/accounts/me` | 200 | 19 | `qa-d1678a95-88ba-4442-a4b5-68f886c113ff` |
| 4 | `GET /v1/accounts/me` | 200 | 19 | `qa-9ec38fc9-7536-4ee6-80a0-67c474076a2c` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-fe3a4857-e8b3-4b35-8ca3-2df1bf9df21d` |
| 6 | `GET /v1/accounts/me` | 401 | 44 | `qa-c3fc8de4-2da7-441f-aeb8-50202c4ad978` |
| 7 | `GET /v1/accounts/me` | 401 | 11 | `qa-bb40ed1d-7d7f-465e-a616-898376591333` |
| 8 | `POST /v1/auth/token` | 200 | 43 | `qa-3e017256-0058-459e-9ac1-6b05ec6f4de3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-22e332a2-c7ab-4760-b3b9-c16a3137cc67` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-a9b4f5e7-4f81-4d0a-bd66-2ac5cd7235bc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-21c9609b-5966-4950-8b7f-4fd33d3a7eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c9609b-5966-4950-8b7f-4fd33d3a7eaa
Content-Type: application/json

--- request body ---
{"handle":"qa-376cc8b184a8","displayName":"QA 376cc8b184a8","password":"****","region":"eu"}

--- response: 201 in 476 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-21c9609b-5966-4950-8b7f-4fd33d3a7eaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-376cc8b184a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25b9f0a5-2195-4a9e-8342-0f490c40aeaf","handle":"qa-376cc8b184a8","displayName":"QA 376cc8b184a8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.977507147Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1cbe397e-2302-40e6-a8e9-5a0476d84846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cbe397e-2302-40e6-a8e9-5a0476d84846
Content-Type: application/json

--- request body ---
{"handle":"qa-376cc8b184a8","password":"****","ttlSeconds":1}

--- response: 200 in 73 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cbe397e-2302-40e6-a8e9-5a0476d84846
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_25b9f0a5-2195-4a9e-8342-0f490c40aeaf"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1678a95-88ba-4442-a4b5-68f886c113ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1678a95-88ba-4442-a4b5-68f886c113ff
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1678a95-88ba-4442-a4b5-68f886c113ff
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

{"id":"acc_25b9f0a5-2195-4a9e-8342-0f490c40aeaf","handle":"qa-376cc8b184a8","displayName":"QA 376cc8b184a8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.977507147Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ec38fc9-7536-4ee6-80a0-67c474076a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ec38fc9-7536-4ee6-80a0-67c474076a2c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ec38fc9-7536-4ee6-80a0-67c474076a2c
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

{"id":"acc_25b9f0a5-2195-4a9e-8342-0f490c40aeaf","handle":"qa-376cc8b184a8","displayName":"QA 376cc8b184a8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.977507147Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe3a4857-e8b3-4b35-8ca3-2df1bf9df21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe3a4857-e8b3-4b35-8ca3-2df1bf9df21d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe3a4857-e8b3-4b35-8ca3-2df1bf9df21d
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

{"id":"acc_25b9f0a5-2195-4a9e-8342-0f490c40aeaf","handle":"qa-376cc8b184a8","displayName":"QA 376cc8b184a8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.977507147Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3fc8de4-2da7-441f-aeb8-50202c4ad978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3fc8de4-2da7-441f-aeb8-50202c4ad978
Content-Type: application/json

--- response: 401 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3fc8de4-2da7-441f-aeb8-50202c4ad978
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-c3fc8de4-2da7-441f-aeb8-50202c4ad978"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb40ed1d-7d7f-465e-a616-898376591333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb40ed1d-7d7f-465e-a616-898376591333
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb40ed1d-7d7f-465e-a616-898376591333
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-bb40ed1d-7d7f-465e-a616-898376591333"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3e017256-0058-459e-9ac1-6b05ec6f4de3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e017256-0058-459e-9ac1-6b05ec6f4de3
Content-Type: application/json

--- request body ---
{"handle":"qa-376cc8b184a8","password":"****"}

--- response: 200 in 43 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e017256-0058-459e-9ac1-6b05ec6f4de3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25b9f0a5-2195-4a9e-8342-0f490c40aeaf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22e332a2-c7ab-4760-b3b9-c16a3137cc67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22e332a2-c7ab-4760-b3b9-c16a3137cc67
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22e332a2-c7ab-4760-b3b9-c16a3137cc67
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
correlation: qa-a9b4f5e7-4f81-4d0a-bd66-2ac5cd7235bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9b4f5e7-4f81-4d0a-bd66-2ac5cd7235bc
Content-Type: application/json

--- request body ---
{"handle":"qa-376cc8b184a8","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9b4f5e7-4f81-4d0a-bd66-2ac5cd7235bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9b4f5e7-4f81-4d0a-bd66-2ac5cd7235bc"}
```
