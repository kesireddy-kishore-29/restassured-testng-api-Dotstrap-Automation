# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-834d0e62-3a2c-4628-92c9-356ca2dfd2c9` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-21fc99dd-4348-46fe-b711-dbf79a7ce3c2` |
| 3 | `GET /v1/accounts/me` | 200 | 23 | `qa-db6b3dec-639c-48d4-863c-c3d5b9425ec2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-bdff9b6d-0a61-4dc9-b1c8-258686acbc59` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-1b9329be-e725-401b-b443-7466928bba0a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-834d0e62-3a2c-4628-92c9-356ca2dfd2c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-834d0e62-3a2c-4628-92c9-356ca2dfd2c9
Content-Type: application/json

--- request body ---
{"handle":"qa-c9bdee5aaaa1","displayName":"QA c9bdee5aaaa1","password":"****","region":"us"}

--- response: 201 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-834d0e62-3a2c-4628-92c9-356ca2dfd2c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-c9bdee5aaaa1
X-Served-Region: us
Content-Length: 181

{"id":"acc_e3d5f131-b763-4b95-8c16-2e3e82449895","handle":"qa-c9bdee5aaaa1","displayName":"QA c9bdee5aaaa1","region":"us","role":"user","createdAt":"2026-10-26T07:54:48.625539714Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-21fc99dd-4348-46fe-b711-dbf79a7ce3c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21fc99dd-4348-46fe-b711-dbf79a7ce3c2
Content-Type: application/json

--- request body ---
{"handle":"qa-c9bdee5aaaa1","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-21fc99dd-4348-46fe-b711-dbf79a7ce3c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3d5f131-b763-4b95-8c16-2e3e82449895"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-db6b3dec-639c-48d4-863c-c3d5b9425ec2

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-db6b3dec-639c-48d4-863c-c3d5b9425ec2
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-db6b3dec-639c-48d4-863c-c3d5b9425ec2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_e3d5f131-b763-4b95-8c16-2e3e82449895","handle":"qa-c9bdee5aaaa1","displayName":"QA c9bdee5aaaa1","region":"us","role":"user","createdAt":"2026-10-26T07:54:48.625539714Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bdff9b6d-0a61-4dc9-b1c8-258686acbc59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdff9b6d-0a61-4dc9-b1c8-258686acbc59
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bdff9b6d-0a61-4dc9-b1c8-258686acbc59
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1b9329be-e725-401b-b443-7466928bba0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b9329be-e725-401b-b443-7466928bba0a
Content-Type: application/json

--- request body ---
{"handle":"qa-c9bdee5aaaa1","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b9329be-e725-401b-b443-7466928bba0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b9329be-e725-401b-b443-7466928bba0a"}
```
