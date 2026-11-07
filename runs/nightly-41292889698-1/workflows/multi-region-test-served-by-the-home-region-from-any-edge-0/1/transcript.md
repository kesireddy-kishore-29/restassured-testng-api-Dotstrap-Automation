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
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-6b1334a1-21f0-4736-953c-b3b7ae1b8532` |
| 2 | `POST /v1/auth/token` | 200 | 121 | `qa-a0006323-0331-4205-963b-c3fc461e8708` |
| 3 | `GET /v1/accounts/me` | 200 | 135 | `qa-d97310b2-d595-48b1-9a90-b859514f0345` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-aa2abe0a-ab8c-471f-bd4a-613ab11f4ae2` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-bede4c18-79a7-49b7-b3cc-7ed2bd528640` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b1334a1-21f0-4736-953c-b3b7ae1b8532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b1334a1-21f0-4736-953c-b3b7ae1b8532
Content-Type: application/json

--- request body ---
{"handle":"qa-0328799d21cb","displayName":"QA 0328799d21cb","password":"****","region":"in"}

--- response: 201 in 492 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b1334a1-21f0-4736-953c-b3b7ae1b8532
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
Location: /v1/accounts/qa-0328799d21cb
X-Served-Region: in
Content-Length: 181

{"id":"acc_d4955606-eccb-40c2-b933-d7af1831dd1b","handle":"qa-0328799d21cb","displayName":"QA 0328799d21cb","region":"in","role":"user","createdAt":"2026-11-01T09:23:23.659800184Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a0006323-0331-4205-963b-c3fc461e8708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0006323-0331-4205-963b-c3fc461e8708
Content-Type: application/json

--- request body ---
{"handle":"qa-0328799d21cb","password":"****"}

--- response: 200 in 121 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0006323-0331-4205-963b-c3fc461e8708
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4955606-eccb-40c2-b933-d7af1831dd1b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d97310b2-d595-48b1-9a90-b859514f0345

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-d97310b2-d595-48b1-9a90-b859514f0345
Content-Type: application/json

--- response: 200 in 135 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d97310b2-d595-48b1-9a90-b859514f0345
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

{"id":"acc_d4955606-eccb-40c2-b933-d7af1831dd1b","handle":"qa-0328799d21cb","displayName":"QA 0328799d21cb","region":"in","role":"user","createdAt":"2026-11-01T09:23:23.659800184Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa2abe0a-ab8c-471f-bd4a-613ab11f4ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa2abe0a-ab8c-471f-bd4a-613ab11f4ae2
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa2abe0a-ab8c-471f-bd4a-613ab11f4ae2
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
correlation: qa-bede4c18-79a7-49b7-b3cc-7ed2bd528640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bede4c18-79a7-49b7-b3cc-7ed2bd528640
Content-Type: application/json

--- request body ---
{"handle":"qa-0328799d21cb","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bede4c18-79a7-49b7-b3cc-7ed2bd528640
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bede4c18-79a7-49b7-b3cc-7ed2bd528640"}
```
