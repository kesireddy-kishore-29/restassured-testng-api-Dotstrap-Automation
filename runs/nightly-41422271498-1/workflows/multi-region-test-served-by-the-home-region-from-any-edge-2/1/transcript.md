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
| 1 | `POST /v1/accounts` | 201 | 382 | `qa-5409d308-1ea9-491c-b01a-393146af4ef7` |
| 2 | `POST /v1/auth/token` | 200 | 38 | `qa-a7ac0e82-9246-4f8e-aed1-12527b0a7d4d` |
| 3 | `GET /v1/accounts/me` | 200 | 73 | `qa-6441fbf9-3d4d-4842-a897-ec23388c45f7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-ae4981f8-a04b-4ddc-b65b-a61419673353` |
| 5 | `POST /v1/auth/token` | 401 | 30 | `qa-d501a990-6877-4e65-9243-39fae591a663` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5409d308-1ea9-491c-b01a-393146af4ef7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5409d308-1ea9-491c-b01a-393146af4ef7
Content-Type: application/json

--- request body ---
{"handle":"qa-4aa1ace6fcb1","displayName":"QA 4aa1ace6fcb1","password":"****","region":"us"}

--- response: 201 in 382 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5409d308-1ea9-491c-b01a-393146af4ef7
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
Location: /v1/accounts/qa-4aa1ace6fcb1
X-Served-Region: us
Content-Length: 181

{"id":"acc_3378d9bd-7c42-4ca5-9223-b76af538ced1","handle":"qa-4aa1ace6fcb1","displayName":"QA 4aa1ace6fcb1","region":"us","role":"user","createdAt":"2026-11-02T09:38:48.645561495Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a7ac0e82-9246-4f8e-aed1-12527b0a7d4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7ac0e82-9246-4f8e-aed1-12527b0a7d4d
Content-Type: application/json

--- request body ---
{"handle":"qa-4aa1ace6fcb1","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7ac0e82-9246-4f8e-aed1-12527b0a7d4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3378d9bd-7c42-4ca5-9223-b76af538ced1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-6441fbf9-3d4d-4842-a897-ec23388c45f7

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-6441fbf9-3d4d-4842-a897-ec23388c45f7
Content-Type: application/json

--- response: 200 in 73 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6441fbf9-3d4d-4842-a897-ec23388c45f7
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

{"id":"acc_3378d9bd-7c42-4ca5-9223-b76af538ced1","handle":"qa-4aa1ace6fcb1","displayName":"QA 4aa1ace6fcb1","region":"us","role":"user","createdAt":"2026-11-02T09:38:48.645561495Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae4981f8-a04b-4ddc-b65b-a61419673353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae4981f8-a04b-4ddc-b65b-a61419673353
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae4981f8-a04b-4ddc-b65b-a61419673353
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
correlation: qa-d501a990-6877-4e65-9243-39fae591a663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d501a990-6877-4e65-9243-39fae591a663
Content-Type: application/json

--- request body ---
{"handle":"qa-4aa1ace6fcb1","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d501a990-6877-4e65-9243-39fae591a663
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d501a990-6877-4e65-9243-39fae591a663"}
```
