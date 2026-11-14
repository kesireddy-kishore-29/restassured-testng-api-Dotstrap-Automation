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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-62a69243-1b04-4b98-9b9e-2293776d1548` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-cea91ecf-977a-4dec-ae51-2499def30ca5` |
| 3 | `GET /v1/accounts/me` | 200 | 5 | `qa-7651492b-de34-42f5-b000-8e2bf69c577c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fc87ee32-214d-4246-887e-e9a98996c973` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-ca1a68ce-16cb-48d8-b062-eda2ffde6100` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62a69243-1b04-4b98-9b9e-2293776d1548

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a69243-1b04-4b98-9b9e-2293776d1548
Content-Type: application/json

--- request body ---
{"handle":"qa-36d20ef4e6af","displayName":"QA 36d20ef4e6af","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-62a69243-1b04-4b98-9b9e-2293776d1548
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
Location: /v1/accounts/qa-36d20ef4e6af
X-Served-Region: us
Content-Length: 181

{"id":"acc_65ceefb4-0343-4045-a5e8-7a32a7fe9a0b","handle":"qa-36d20ef4e6af","displayName":"QA 36d20ef4e6af","region":"us","role":"user","createdAt":"2026-11-11T09:34:23.896320077Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cea91ecf-977a-4dec-ae51-2499def30ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea91ecf-977a-4dec-ae51-2499def30ca5
Content-Type: application/json

--- request body ---
{"handle":"qa-36d20ef4e6af","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-cea91ecf-977a-4dec-ae51-2499def30ca5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65ceefb4-0343-4045-a5e8-7a32a7fe9a0b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7651492b-de34-42f5-b000-8e2bf69c577c

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-7651492b-de34-42f5-b000-8e2bf69c577c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7651492b-de34-42f5-b000-8e2bf69c577c
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

{"id":"acc_65ceefb4-0343-4045-a5e8-7a32a7fe9a0b","handle":"qa-36d20ef4e6af","displayName":"QA 36d20ef4e6af","region":"us","role":"user","createdAt":"2026-11-11T09:34:23.896320077Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc87ee32-214d-4246-887e-e9a98996c973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc87ee32-214d-4246-887e-e9a98996c973
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc87ee32-214d-4246-887e-e9a98996c973
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
correlation: qa-ca1a68ce-16cb-48d8-b062-eda2ffde6100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca1a68ce-16cb-48d8-b062-eda2ffde6100
Content-Type: application/json

--- request body ---
{"handle":"qa-36d20ef4e6af","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca1a68ce-16cb-48d8-b062-eda2ffde6100
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca1a68ce-16cb-48d8-b062-eda2ffde6100"}
```
