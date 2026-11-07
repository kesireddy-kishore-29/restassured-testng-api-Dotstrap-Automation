# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 316 | `qa-0929d73b-2e54-4f82-a5bc-da34a8bb7d1c` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-c5972f87-b36e-4245-a554-a1de110535d6` |
| 3 | `GET /v1/admin/stats` | 403 | 47 | `qa-4830de52-3d23-4bdf-b334-942835cc0a4e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4a35e8ee-742b-4c30-a630-9e501b6b7afd` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-c2f0d83c-6ea7-44ab-8925-98eaf437e891` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0929d73b-2e54-4f82-a5bc-da34a8bb7d1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0929d73b-2e54-4f82-a5bc-da34a8bb7d1c
Content-Type: application/json

--- request body ---
{"handle":"qa-0948338d8092","displayName":"QA 0948338d8092","password":"****","region":"eu"}

--- response: 201 in 316 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0929d73b-2e54-4f82-a5bc-da34a8bb7d1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-0948338d8092
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe753594-0c3e-4732-8d93-30aab8fd5de3","handle":"qa-0948338d8092","displayName":"QA 0948338d8092","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.805225140Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c5972f87-b36e-4245-a554-a1de110535d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5972f87-b36e-4245-a554-a1de110535d6
Content-Type: application/json

--- request body ---
{"handle":"qa-0948338d8092","password":"****"}

--- response: 200 in 44 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5972f87-b36e-4245-a554-a1de110535d6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe753594-0c3e-4732-8d93-30aab8fd5de3"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-4830de52-3d23-4bdf-b334-942835cc0a4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4830de52-3d23-4bdf-b334-942835cc0a4e
Content-Type: application/json

--- response: 403 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4830de52-3d23-4bdf-b334-942835cc0a4e
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-4830de52-3d23-4bdf-b334-942835cc0a4e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a35e8ee-742b-4c30-a630-9e501b6b7afd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a35e8ee-742b-4c30-a630-9e501b6b7afd
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a35e8ee-742b-4c30-a630-9e501b6b7afd
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c2f0d83c-6ea7-44ab-8925-98eaf437e891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2f0d83c-6ea7-44ab-8925-98eaf437e891
Content-Type: application/json

--- request body ---
{"handle":"qa-0948338d8092","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2f0d83c-6ea7-44ab-8925-98eaf437e891
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2f0d83c-6ea7-44ab-8925-98eaf437e891"}
```
