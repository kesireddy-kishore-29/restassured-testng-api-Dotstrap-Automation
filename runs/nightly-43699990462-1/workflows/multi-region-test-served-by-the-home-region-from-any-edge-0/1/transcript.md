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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-b8244bc0-f72c-4034-acd1-6d37c6f5036d` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-f800d9c4-cd3a-4806-9406-e8863e2f4b64` |
| 3 | `GET /v1/accounts/me` | 200 | 25 | `qa-a7cc47b8-4d02-4019-974a-d777c095ac7f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3f6a7f58-5fc2-48b6-8011-3f3d70693ab4` |
| 5 | `POST /v1/auth/token` | 401 | 23 | `qa-3c8c5b05-eb4e-4242-bcd4-109d1411b1e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b8244bc0-f72c-4034-acd1-6d37c6f5036d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8244bc0-f72c-4034-acd1-6d37c6f5036d
Content-Type: application/json

--- request body ---
{"handle":"qa-851675be094b","displayName":"QA 851675be094b","password":"****","region":"in"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8244bc0-f72c-4034-acd1-6d37c6f5036d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-851675be094b
X-Served-Region: in
Content-Length: 181

{"id":"acc_70bf4e31-cfb0-410f-a100-0e0317881be2","handle":"qa-851675be094b","displayName":"QA 851675be094b","region":"in","role":"user","createdAt":"2026-11-15T09:36:16.314673916Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f800d9c4-cd3a-4806-9406-e8863e2f4b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f800d9c4-cd3a-4806-9406-e8863e2f4b64
Content-Type: application/json

--- request body ---
{"handle":"qa-851675be094b","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-f800d9c4-cd3a-4806-9406-e8863e2f4b64
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_70bf4e31-cfb0-410f-a100-0e0317881be2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7cc47b8-4d02-4019-974a-d777c095ac7f

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-a7cc47b8-4d02-4019-974a-d777c095ac7f
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7cc47b8-4d02-4019-974a-d777c095ac7f
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

{"id":"acc_70bf4e31-cfb0-410f-a100-0e0317881be2","handle":"qa-851675be094b","displayName":"QA 851675be094b","region":"in","role":"user","createdAt":"2026-11-15T09:36:16.314673916Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f6a7f58-5fc2-48b6-8011-3f3d70693ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f6a7f58-5fc2-48b6-8011-3f3d70693ab4
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f6a7f58-5fc2-48b6-8011-3f3d70693ab4
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
correlation: qa-3c8c5b05-eb4e-4242-bcd4-109d1411b1e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c8c5b05-eb4e-4242-bcd4-109d1411b1e9
Content-Type: application/json

--- request body ---
{"handle":"qa-851675be094b","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c8c5b05-eb4e-4242-bcd4-109d1411b1e9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c8c5b05-eb4e-4242-bcd4-109d1411b1e9"}
```
