# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-a24cb4f0-b8e6-4fb7-a9d5-725d2e427b1c` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-a1ea3888-f0ec-470b-a915-dd2e977ce4c6` |
| 3 | `GET /v1/conversations/{id}` | 404 | 16 | `qa-58330733-c2fb-45d5-b427-3c5b790a71a3` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 11 | `qa-c8b7fe4e-a177-4ae3-bf0e-6ca6e17cc812` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-6c870a3f-92cb-4682-a2c2-58f47f6b48d4` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-8b771400-10bf-43ca-8479-5c78a506a002` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a24cb4f0-b8e6-4fb7-a9d5-725d2e427b1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a24cb4f0-b8e6-4fb7-a9d5-725d2e427b1c
Content-Type: application/json

--- request body ---
{"handle":"qa-b3a72d99aa01","displayName":"QA b3a72d99aa01","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a24cb4f0-b8e6-4fb7-a9d5-725d2e427b1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Location: /v1/accounts/qa-b3a72d99aa01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eab314cc-3ba9-4fbe-aafd-286c672436ad","handle":"qa-b3a72d99aa01","displayName":"QA b3a72d99aa01","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.507376259Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a1ea3888-f0ec-470b-a915-dd2e977ce4c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1ea3888-f0ec-470b-a915-dd2e977ce4c6
Content-Type: application/json

--- request body ---
{"handle":"qa-b3a72d99aa01","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1ea3888-f0ec-470b-a915-dd2e977ce4c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eab314cc-3ba9-4fbe-aafd-286c672436ad"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-58330733-c2fb-45d5-b427-3c5b790a71a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58330733-c2fb-45d5-b427-3c5b790a71a3
Content-Type: application/json

--- response: 404 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58330733-c2fb-45d5-b427-3c5b790a71a3
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-58330733-c2fb-45d5-b427-3c5b790a71a3"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-c8b7fe4e-a177-4ae3-bf0e-6ca6e17cc812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b7fe4e-a177-4ae3-bf0e-6ca6e17cc812
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8b7fe4e-a177-4ae3-bf0e-6ca6e17cc812
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-c8b7fe4e-a177-4ae3-bf0e-6ca6e17cc812"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c870a3f-92cb-4682-a2c2-58f47f6b48d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c870a3f-92cb-4682-a2c2-58f47f6b48d4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c870a3f-92cb-4682-a2c2-58f47f6b48d4
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b771400-10bf-43ca-8479-5c78a506a002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b771400-10bf-43ca-8479-5c78a506a002
Content-Type: application/json

--- request body ---
{"handle":"qa-b3a72d99aa01","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b771400-10bf-43ca-8479-5c78a506a002
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b771400-10bf-43ca-8479-5c78a506a002"}
```
