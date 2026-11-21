# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 292 | `qa-f6814573-730c-437c-bfcd-51f155daf869` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-e9da4a1f-c071-4372-8b45-3c869c6becb0` |
| 3 | `GET /v1/accounts/me` | 200 | 60 | `qa-e6be4123-cc3f-46b1-bd62-64f1e0fdf57c` |
| 4 | `GET /v1/accounts/me` | 200 | 23 | `qa-8ddf2239-24f0-4d5e-83f0-32ea318f2f41` |
| 5 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-fbc03bd7-10d7-4e71-bcfa-06b279a0bd69` |
| 6 | `POST /v1/auth/token` | 401 | 17 | `qa-d9eee602-7ce6-40ca-9866-0cc1e54b9f25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6814573-730c-437c-bfcd-51f155daf869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6814573-730c-437c-bfcd-51f155daf869
Content-Type: application/json

--- request body ---
{"handle":"qa-36a7683fc444","displayName":"QA 36a7683fc444","password":"****","region":"eu"}

--- response: 201 in 292 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6814573-730c-437c-bfcd-51f155daf869
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
Location: /v1/accounts/qa-36a7683fc444
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d7e87e3-148c-44d2-90f1-f2965911180c","handle":"qa-36a7683fc444","displayName":"QA 36a7683fc444","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.392262377Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e9da4a1f-c071-4372-8b45-3c869c6becb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9da4a1f-c071-4372-8b45-3c869c6becb0
Content-Type: application/json

--- request body ---
{"handle":"qa-36a7683fc444","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9da4a1f-c071-4372-8b45-3c869c6becb0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d7e87e3-148c-44d2-90f1-f2965911180c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e6be4123-cc3f-46b1-bd62-64f1e0fdf57c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6be4123-cc3f-46b1-bd62-64f1e0fdf57c
Content-Type: application/json

--- response: 200 in 60 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6be4123-cc3f-46b1-bd62-64f1e0fdf57c
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

{"id":"acc_0d7e87e3-148c-44d2-90f1-f2965911180c","handle":"qa-36a7683fc444","displayName":"QA 36a7683fc444","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.392262377Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ddf2239-24f0-4d5e-83f0-32ea318f2f41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ddf2239-24f0-4d5e-83f0-32ea318f2f41
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ddf2239-24f0-4d5e-83f0-32ea318f2f41
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

{"id":"acc_0d7e87e3-148c-44d2-90f1-f2965911180c","handle":"qa-36a7683fc444","displayName":"QA 36a7683fc444","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.392262377Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbc03bd7-10d7-4e71-bcfa-06b279a0bd69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc03bd7-10d7-4e71-bcfa-06b279a0bd69
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbc03bd7-10d7-4e71-bcfa-06b279a0bd69
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
correlation: qa-d9eee602-7ce6-40ca-9866-0cc1e54b9f25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9eee602-7ce6-40ca-9866-0cc1e54b9f25
Content-Type: application/json

--- request body ---
{"handle":"qa-36a7683fc444","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9eee602-7ce6-40ca-9866-0cc1e54b9f25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9eee602-7ce6-40ca-9866-0cc1e54b9f25"}
```
