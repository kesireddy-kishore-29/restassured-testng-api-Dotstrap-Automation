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
| 1 | `POST /v1/accounts` | 201 | 428 | `qa-f35b7cd0-a7f2-4913-ab10-65682128059a` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-4239b225-ceca-4eb9-aa98-5e56b42d1129` |
| 3 | `GET /v1/accounts/me` | 200 | 56 | `qa-87beab80-63ce-4741-8e01-226c845f08c9` |
| 4 | `GET /v1/accounts/me` | 200 | 30 | `qa-29d18934-b351-4404-aa9f-47fb993d591b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-a30da5ff-f53e-456d-96d5-f2ed74361c7b` |
| 6 | `POST /v1/auth/token` | 401 | 23 | `qa-cb4724ed-9747-4acd-8624-675c1f96863d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f35b7cd0-a7f2-4913-ab10-65682128059a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f35b7cd0-a7f2-4913-ab10-65682128059a
Content-Type: application/json

--- request body ---
{"handle":"qa-a40bd78606a5","displayName":"QA a40bd78606a5","password":"****","region":"eu"}

--- response: 201 in 428 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f35b7cd0-a7f2-4913-ab10-65682128059a
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
Location: /v1/accounts/qa-a40bd78606a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08675399-bd88-4505-8fd9-6077726eac2c","handle":"qa-a40bd78606a5","displayName":"QA a40bd78606a5","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.061353238Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4239b225-ceca-4eb9-aa98-5e56b42d1129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4239b225-ceca-4eb9-aa98-5e56b42d1129
Content-Type: application/json

--- request body ---
{"handle":"qa-a40bd78606a5","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-4239b225-ceca-4eb9-aa98-5e56b42d1129
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08675399-bd88-4505-8fd9-6077726eac2c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-87beab80-63ce-4741-8e01-226c845f08c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87beab80-63ce-4741-8e01-226c845f08c9
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-87beab80-63ce-4741-8e01-226c845f08c9
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

{"id":"acc_08675399-bd88-4505-8fd9-6077726eac2c","handle":"qa-a40bd78606a5","displayName":"QA a40bd78606a5","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.061353238Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-29d18934-b351-4404-aa9f-47fb993d591b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29d18934-b351-4404-aa9f-47fb993d591b
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-29d18934-b351-4404-aa9f-47fb993d591b
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

{"id":"acc_08675399-bd88-4505-8fd9-6077726eac2c","handle":"qa-a40bd78606a5","displayName":"QA a40bd78606a5","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.061353238Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a30da5ff-f53e-456d-96d5-f2ed74361c7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30da5ff-f53e-456d-96d5-f2ed74361c7b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a30da5ff-f53e-456d-96d5-f2ed74361c7b
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
correlation: qa-cb4724ed-9747-4acd-8624-675c1f96863d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4724ed-9747-4acd-8624-675c1f96863d
Content-Type: application/json

--- request body ---
{"handle":"qa-a40bd78606a5","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb4724ed-9747-4acd-8624-675c1f96863d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb4724ed-9747-4acd-8624-675c1f96863d"}
```
