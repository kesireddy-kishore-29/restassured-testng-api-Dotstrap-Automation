# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 436 | `qa-6f7a6a5c-fc80-4773-ab99-8f64a44b9899` |
| 2 | `POST /v1/accounts` | 409 | 10 | `qa-0fdca4f8-f07e-4aa7-bd2c-3fa309be7c33` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-13cd3388-f5a6-44b9-afb6-8803ff333f54` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f9f44ae9-ef23-4826-a04d-25f3c33fbc73` |
| 5 | `POST /v1/auth/token` | 401 | 18 | `qa-dc7dabab-647b-42fe-b415-5af7e9dd7b43` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f7a6a5c-fc80-4773-ab99-8f64a44b9899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f7a6a5c-fc80-4773-ab99-8f64a44b9899
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdab93a480b","displayName":"QA 9fdab93a480b","password":"****","region":"eu"}

--- response: 201 in 436 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f7a6a5c-fc80-4773-ab99-8f64a44b9899
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
Location: /v1/accounts/qa-9fdab93a480b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f0a5e81-3155-42f1-b50b-d23d22f43392","handle":"qa-9fdab93a480b","displayName":"QA 9fdab93a480b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:19.132984053Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0fdca4f8-f07e-4aa7-bd2c-3fa309be7c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fdca4f8-f07e-4aa7-bd2c-3fa309be7c33
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdab93a480b","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fdca4f8-f07e-4aa7-bd2c-3fa309be7c33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-9fdab93a480b' is in use.","instance":"/v1/accounts","correlationId":"qa-0fdca4f8-f07e-4aa7-bd2c-3fa309be7c33"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-13cd3388-f5a6-44b9-afb6-8803ff333f54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13cd3388-f5a6-44b9-afb6-8803ff333f54
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdab93a480b","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-13cd3388-f5a6-44b9-afb6-8803ff333f54
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f0a5e81-3155-42f1-b50b-d23d22f43392"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9f44ae9-ef23-4826-a04d-25f3c33fbc73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9f44ae9-ef23-4826-a04d-25f3c33fbc73
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9f44ae9-ef23-4826-a04d-25f3c33fbc73
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-dc7dabab-647b-42fe-b415-5af7e9dd7b43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc7dabab-647b-42fe-b415-5af7e9dd7b43
Content-Type: application/json

--- request body ---
{"handle":"qa-9fdab93a480b","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc7dabab-647b-42fe-b415-5af7e9dd7b43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc7dabab-647b-42fe-b415-5af7e9dd7b43"}
```
