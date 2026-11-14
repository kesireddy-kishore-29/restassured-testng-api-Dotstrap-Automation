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
| 1 | `POST /v1/accounts` | 201 | 288 | `qa-86cdf896-056f-458e-8435-c7144dc9b841` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-7dbd362b-a2e4-4a89-8d52-ee7743ccdf4d` |
| 3 | `GET /v1/admin/stats` | 403 | 32 | `qa-63be4fce-bc91-4f01-ad70-dac1ab104d6c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-1c328156-e7dd-43a9-a69d-3a6c5901ede3` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-a566be42-7715-4bae-8c58-fbd8b13a23e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86cdf896-056f-458e-8435-c7144dc9b841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86cdf896-056f-458e-8435-c7144dc9b841
Content-Type: application/json

--- request body ---
{"handle":"qa-6bb884370743","displayName":"QA 6bb884370743","password":"****","region":"eu"}

--- response: 201 in 288 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-86cdf896-056f-458e-8435-c7144dc9b841
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-6bb884370743
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bdf6edb1-8d5d-42e8-be43-fa424d4119c6","handle":"qa-6bb884370743","displayName":"QA 6bb884370743","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.611716814Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7dbd362b-a2e4-4a89-8d52-ee7743ccdf4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dbd362b-a2e4-4a89-8d52-ee7743ccdf4d
Content-Type: application/json

--- request body ---
{"handle":"qa-6bb884370743","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dbd362b-a2e4-4a89-8d52-ee7743ccdf4d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bdf6edb1-8d5d-42e8-be43-fa424d4119c6"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-63be4fce-bc91-4f01-ad70-dac1ab104d6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63be4fce-bc91-4f01-ad70-dac1ab104d6c
Content-Type: application/json

--- response: 403 in 32 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63be4fce-bc91-4f01-ad70-dac1ab104d6c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-63be4fce-bc91-4f01-ad70-dac1ab104d6c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c328156-e7dd-43a9-a69d-3a6c5901ede3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c328156-e7dd-43a9-a69d-3a6c5901ede3
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c328156-e7dd-43a9-a69d-3a6c5901ede3
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
correlation: qa-a566be42-7715-4bae-8c58-fbd8b13a23e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a566be42-7715-4bae-8c58-fbd8b13a23e1
Content-Type: application/json

--- request body ---
{"handle":"qa-6bb884370743","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a566be42-7715-4bae-8c58-fbd8b13a23e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a566be42-7715-4bae-8c58-fbd8b13a23e1"}
```
