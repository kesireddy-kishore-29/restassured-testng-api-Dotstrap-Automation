# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-f579c4ce-fb86-4cd0-ab0c-e94760313ad5` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-8a1c0c13-3c55-4cd9-94aa-637b2f61b0a0` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-983042ef-825b-470d-a470-4c66a6d409ea` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9b3b8ef4-4003-4847-b868-11c404112016` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-ac0b6d7a-dee4-45ae-a869-57e7e6ff58fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f579c4ce-fb86-4cd0-ab0c-e94760313ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f579c4ce-fb86-4cd0-ab0c-e94760313ad5
Content-Type: application/json

--- request body ---
{"handle":"qa-e8e4dbf73420","displayName":"QA e8e4dbf73420","password":"****","region":"in"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f579c4ce-fb86-4cd0-ab0c-e94760313ad5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-e8e4dbf73420
X-Served-Region: in
Content-Length: 181

{"id":"acc_7a840961-75ee-4918-a68e-d63cc43fdbe4","handle":"qa-e8e4dbf73420","displayName":"QA e8e4dbf73420","region":"in","role":"user","createdAt":"2026-11-18T10:19:40.549883744Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8a1c0c13-3c55-4cd9-94aa-637b2f61b0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a1c0c13-3c55-4cd9-94aa-637b2f61b0a0
Content-Type: application/json

--- request body ---
{"handle":"qa-e8e4dbf73420","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a1c0c13-3c55-4cd9-94aa-637b2f61b0a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a840961-75ee-4918-a68e-d63cc43fdbe4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-983042ef-825b-470d-a470-4c66a6d409ea

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-983042ef-825b-470d-a470-4c66a6d409ea
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-983042ef-825b-470d-a470-4c66a6d409ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_7a840961-75ee-4918-a68e-d63cc43fdbe4","handle":"qa-e8e4dbf73420","displayName":"QA e8e4dbf73420","region":"in","role":"user","createdAt":"2026-11-18T10:19:40.549883744Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b3b8ef4-4003-4847-b868-11c404112016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b3b8ef4-4003-4847-b868-11c404112016
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b3b8ef4-4003-4847-b868-11c404112016
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ac0b6d7a-dee4-45ae-a869-57e7e6ff58fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0b6d7a-dee4-45ae-a869-57e7e6ff58fe
Content-Type: application/json

--- request body ---
{"handle":"qa-e8e4dbf73420","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac0b6d7a-dee4-45ae-a869-57e7e6ff58fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac0b6d7a-dee4-45ae-a869-57e7e6ff58fe"}
```
