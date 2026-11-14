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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-0fc6d34a-56ec-421a-90b8-59f18f4e62c9` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-2e025ed0-6f4c-4581-af91-50fcc679b65c` |
| 3 | `GET /v1/accounts/me` | 200 | 5 | `qa-a393351d-4745-4190-8d73-6408654ca525` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-5b804d23-d5b2-46eb-adfc-5df56479e1d0` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-67df3bc7-a1a9-4653-bc79-66cd25601c70` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0fc6d34a-56ec-421a-90b8-59f18f4e62c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc6d34a-56ec-421a-90b8-59f18f4e62c9
Content-Type: application/json

--- request body ---
{"handle":"qa-d7908188cf88","displayName":"QA d7908188cf88","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fc6d34a-56ec-421a-90b8-59f18f4e62c9
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
Location: /v1/accounts/qa-d7908188cf88
X-Served-Region: us
Content-Length: 181

{"id":"acc_8546fa52-2738-4166-a950-29133ddc98af","handle":"qa-d7908188cf88","displayName":"QA d7908188cf88","region":"us","role":"user","createdAt":"2026-11-09T09:56:00.582920605Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2e025ed0-6f4c-4581-af91-50fcc679b65c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e025ed0-6f4c-4581-af91-50fcc679b65c
Content-Type: application/json

--- request body ---
{"handle":"qa-d7908188cf88","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e025ed0-6f4c-4581-af91-50fcc679b65c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8546fa52-2738-4166-a950-29133ddc98af"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a393351d-4745-4190-8d73-6408654ca525

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-a393351d-4745-4190-8d73-6408654ca525
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a393351d-4745-4190-8d73-6408654ca525
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

{"id":"acc_8546fa52-2738-4166-a950-29133ddc98af","handle":"qa-d7908188cf88","displayName":"QA d7908188cf88","region":"us","role":"user","createdAt":"2026-11-09T09:56:00.582920605Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b804d23-d5b2-46eb-adfc-5df56479e1d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b804d23-d5b2-46eb-adfc-5df56479e1d0
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b804d23-d5b2-46eb-adfc-5df56479e1d0
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
correlation: qa-67df3bc7-a1a9-4653-bc79-66cd25601c70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67df3bc7-a1a9-4653-bc79-66cd25601c70
Content-Type: application/json

--- request body ---
{"handle":"qa-d7908188cf88","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67df3bc7-a1a9-4653-bc79-66cd25601c70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67df3bc7-a1a9-4653-bc79-66cd25601c70"}
```
