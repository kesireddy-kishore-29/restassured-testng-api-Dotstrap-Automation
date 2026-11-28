# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-3a64471e-e928-4c20-ad22-22ae4de5e123` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-ea0ae330-159b-402e-b0ec-a9857924e4d9` |
| 3 | `GET /v1/admin/stats` | 403 | 12 | `qa-a459e1b2-d79f-4402-ad0e-c5fcdedf9320` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-284444d7-4c55-49a9-a4f6-1126b507b97f` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-67daebda-32e8-45bb-ae30-272b98c15856` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a64471e-e928-4c20-ad22-22ae4de5e123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a64471e-e928-4c20-ad22-22ae4de5e123
Content-Type: application/json

--- request body ---
{"handle":"qa-e65cae5de39c","displayName":"QA e65cae5de39c","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a64471e-e928-4c20-ad22-22ae4de5e123
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-e65cae5de39c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7ee0d3a-b7f7-4e4e-a103-50d223332912","handle":"qa-e65cae5de39c","displayName":"QA e65cae5de39c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.401076832Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ea0ae330-159b-402e-b0ec-a9857924e4d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea0ae330-159b-402e-b0ec-a9857924e4d9
Content-Type: application/json

--- request body ---
{"handle":"qa-e65cae5de39c","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea0ae330-159b-402e-b0ec-a9857924e4d9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7ee0d3a-b7f7-4e4e-a103-50d223332912"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-a459e1b2-d79f-4402-ad0e-c5fcdedf9320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a459e1b2-d79f-4402-ad0e-c5fcdedf9320
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a459e1b2-d79f-4402-ad0e-c5fcdedf9320
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-a459e1b2-d79f-4402-ad0e-c5fcdedf9320"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-284444d7-4c55-49a9-a4f6-1126b507b97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-284444d7-4c55-49a9-a4f6-1126b507b97f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-284444d7-4c55-49a9-a4f6-1126b507b97f
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-67daebda-32e8-45bb-ae30-272b98c15856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67daebda-32e8-45bb-ae30-272b98c15856
Content-Type: application/json

--- request body ---
{"handle":"qa-e65cae5de39c","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67daebda-32e8-45bb-ae30-272b98c15856
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67daebda-32e8-45bb-ae30-272b98c15856"}
```
