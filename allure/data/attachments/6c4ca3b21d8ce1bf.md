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
| 1 | `POST /v1/accounts` | 201 | 390 | `qa-a15b1043-1d3e-4560-9def-346e74401501` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-18590cbd-0374-40cc-bbf2-fc4810abee5b` |
| 3 | `GET /v1/accounts/me` | 200 | 43 | `qa-bdb65919-a3ca-4437-8de2-107d30254249` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-ec44feca-c102-4215-859b-6c45048507c6` |
| 5 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-02234a2c-e460-4657-a8ff-975835056661` |
| 6 | `POST /v1/auth/token` | 401 | 17 | `qa-e013f8c4-2b8a-40de-9de8-02d88de302f6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a15b1043-1d3e-4560-9def-346e74401501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a15b1043-1d3e-4560-9def-346e74401501
Content-Type: application/json

--- request body ---
{"handle":"qa-2cf8510d669d","displayName":"QA 2cf8510d669d","password":"****","region":"eu"}

--- response: 201 in 390 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a15b1043-1d3e-4560-9def-346e74401501
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
Location: /v1/accounts/qa-2cf8510d669d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b5814f1-a216-46c3-99f6-9beeaa44ced4","handle":"qa-2cf8510d669d","displayName":"QA 2cf8510d669d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.813358591Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-18590cbd-0374-40cc-bbf2-fc4810abee5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18590cbd-0374-40cc-bbf2-fc4810abee5b
Content-Type: application/json

--- request body ---
{"handle":"qa-2cf8510d669d","password":"****"}

--- response: 200 in 64 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-18590cbd-0374-40cc-bbf2-fc4810abee5b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b5814f1-a216-46c3-99f6-9beeaa44ced4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bdb65919-a3ca-4437-8de2-107d30254249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdb65919-a3ca-4437-8de2-107d30254249
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdb65919-a3ca-4437-8de2-107d30254249
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

{"id":"acc_8b5814f1-a216-46c3-99f6-9beeaa44ced4","handle":"qa-2cf8510d669d","displayName":"QA 2cf8510d669d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.813358591Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec44feca-c102-4215-859b-6c45048507c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec44feca-c102-4215-859b-6c45048507c6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec44feca-c102-4215-859b-6c45048507c6
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

{"id":"acc_8b5814f1-a216-46c3-99f6-9beeaa44ced4","handle":"qa-2cf8510d669d","displayName":"QA 2cf8510d669d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.813358591Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02234a2c-e460-4657-a8ff-975835056661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02234a2c-e460-4657-a8ff-975835056661
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02234a2c-e460-4657-a8ff-975835056661
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
correlation: qa-e013f8c4-2b8a-40de-9de8-02d88de302f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e013f8c4-2b8a-40de-9de8-02d88de302f6
Content-Type: application/json

--- request body ---
{"handle":"qa-2cf8510d669d","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e013f8c4-2b8a-40de-9de8-02d88de302f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e013f8c4-2b8a-40de-9de8-02d88de302f6"}
```
