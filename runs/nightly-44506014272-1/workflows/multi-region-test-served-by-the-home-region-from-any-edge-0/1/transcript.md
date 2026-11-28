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
| 1 | `POST /v1/accounts` | 201 | 497 | `qa-a85520ff-0fbf-4f5b-9abf-8bfb3d21328c` |
| 2 | `POST /v1/auth/token` | 200 | 81 | `qa-165cb23a-ca17-4fb3-8408-649380b1014e` |
| 3 | `GET /v1/accounts/me` | 200 | 51 | `qa-8e164030-eb5e-4ea2-8cd5-67eb2cb531c0` |
| 4 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-30e93c00-94aa-40ac-a664-69928ee51543` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-82da5567-6426-45d9-a2a0-73f34eebea4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a85520ff-0fbf-4f5b-9abf-8bfb3d21328c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a85520ff-0fbf-4f5b-9abf-8bfb3d21328c
Content-Type: application/json

--- request body ---
{"handle":"qa-47613d900898","displayName":"QA 47613d900898","password":"****","region":"in"}

--- response: 201 in 497 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-a85520ff-0fbf-4f5b-9abf-8bfb3d21328c
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
Location: /v1/accounts/qa-47613d900898
X-Served-Region: in
Content-Length: 181

{"id":"acc_a23b3e2a-b877-467e-b9fb-cace37d27f5b","handle":"qa-47613d900898","displayName":"QA 47613d900898","region":"in","role":"user","createdAt":"2026-11-19T10:29:44.349487070Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-165cb23a-ca17-4fb3-8408-649380b1014e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-165cb23a-ca17-4fb3-8408-649380b1014e
Content-Type: application/json

--- request body ---
{"handle":"qa-47613d900898","password":"****"}

--- response: 200 in 81 ms ---
Date: Thu, 19 Nov 2026 10:29:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-165cb23a-ca17-4fb3-8408-649380b1014e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a23b3e2a-b877-467e-b9fb-cace37d27f5b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e164030-eb5e-4ea2-8cd5-67eb2cb531c0

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-8e164030-eb5e-4ea2-8cd5-67eb2cb531c0
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e164030-eb5e-4ea2-8cd5-67eb2cb531c0
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

{"id":"acc_a23b3e2a-b877-467e-b9fb-cace37d27f5b","handle":"qa-47613d900898","displayName":"QA 47613d900898","region":"in","role":"user","createdAt":"2026-11-19T10:29:44.349487070Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30e93c00-94aa-40ac-a664-69928ee51543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30e93c00-94aa-40ac-a664-69928ee51543
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30e93c00-94aa-40ac-a664-69928ee51543
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
correlation: qa-82da5567-6426-45d9-a2a0-73f34eebea4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82da5567-6426-45d9-a2a0-73f34eebea4f
Content-Type: application/json

--- request body ---
{"handle":"qa-47613d900898","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82da5567-6426-45d9-a2a0-73f34eebea4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82da5567-6426-45d9-a2a0-73f34eebea4f"}
```
