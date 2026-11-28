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
| 1 | `POST /v1/accounts` | 201 | 362 | `qa-2cf91ad5-8642-434d-8ea5-69da0c499030` |
| 2 | `POST /v1/auth/token` | 200 | 89 | `qa-1adee2b0-13e9-49e4-910b-4293d536eeb4` |
| 3 | `GET /v1/accounts/me` | 200 | 62 | `qa-a1fd94b1-c521-4b50-98e3-21ad3859be17` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-8326da8a-5c6b-4e8d-baa5-2b46f2500880` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d8db56d8-5f0a-4b3a-9d5f-219d7081b91c` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-c8515b25-d83b-4699-896e-182579b7fc7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2cf91ad5-8642-434d-8ea5-69da0c499030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cf91ad5-8642-434d-8ea5-69da0c499030
Content-Type: application/json

--- request body ---
{"handle":"qa-52ba92a0a9e9","displayName":"QA 52ba92a0a9e9","password":"****","region":"eu"}

--- response: 201 in 362 ms ---
Date: Mon, 23 Nov 2026 10:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cf91ad5-8642-434d-8ea5-69da0c499030
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
Location: /v1/accounts/qa-52ba92a0a9e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec64364c-4a6c-4b9f-8e40-4fae6a28ce80","handle":"qa-52ba92a0a9e9","displayName":"QA 52ba92a0a9e9","region":"eu","role":"user","createdAt":"2026-11-23T10:54:54.557334609Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1adee2b0-13e9-49e4-910b-4293d536eeb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1adee2b0-13e9-49e4-910b-4293d536eeb4
Content-Type: application/json

--- request body ---
{"handle":"qa-52ba92a0a9e9","password":"****"}

--- response: 200 in 89 ms ---
Date: Mon, 23 Nov 2026 10:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1adee2b0-13e9-49e4-910b-4293d536eeb4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec64364c-4a6c-4b9f-8e40-4fae6a28ce80"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1fd94b1-c521-4b50-98e3-21ad3859be17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1fd94b1-c521-4b50-98e3-21ad3859be17
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1fd94b1-c521-4b50-98e3-21ad3859be17
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

{"id":"acc_ec64364c-4a6c-4b9f-8e40-4fae6a28ce80","handle":"qa-52ba92a0a9e9","displayName":"QA 52ba92a0a9e9","region":"eu","role":"user","createdAt":"2026-11-23T10:54:54.557334609Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-8326da8a-5c6b-4e8d-baa5-2b46f2500880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8326da8a-5c6b-4e8d-baa5-2b46f2500880
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8326da8a-5c6b-4e8d-baa5-2b46f2500880
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

{"id":"acc_ec64364c-4a6c-4b9f-8e40-4fae6a28ce80","handle":"qa-52ba92a0a9e9","displayName":"QA 52ba92a0a9e9","region":"eu","role":"user","createdAt":"2026-11-23T10:54:54.557334609Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8db56d8-5f0a-4b3a-9d5f-219d7081b91c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8db56d8-5f0a-4b3a-9d5f-219d7081b91c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8db56d8-5f0a-4b3a-9d5f-219d7081b91c
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
correlation: qa-c8515b25-d83b-4699-896e-182579b7fc7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8515b25-d83b-4699-896e-182579b7fc7f
Content-Type: application/json

--- request body ---
{"handle":"qa-52ba92a0a9e9","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8515b25-d83b-4699-896e-182579b7fc7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8515b25-d83b-4699-896e-182579b7fc7f"}
```
