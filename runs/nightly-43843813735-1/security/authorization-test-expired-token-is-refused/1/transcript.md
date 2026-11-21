# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 464 | `qa-df38d211-c939-4ceb-881f-e66ea8a9f88d` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-c68005fa-9260-4285-9139-a7946acd8d99` |
| 3 | `GET /v1/accounts/me` | 200 | 24 | `qa-1c94f4c7-a116-408c-b3a3-2da4add1e3fc` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-5c46888a-a521-4552-9db9-c36f83fe40d2` |
| 5 | `GET /v1/accounts/me` | 200 | 9 | `qa-2bc0ce0a-3f21-44ac-84fb-694b41c783d1` |
| 6 | `GET /v1/accounts/me` | 401 | 9 | `qa-9a37217f-1dae-4820-ba93-de4c021ca772` |
| 7 | `GET /v1/accounts/me` | 401 | 9 | `qa-176f1043-242a-4080-af15-a7a0aff34e43` |
| 8 | `POST /v1/auth/token` | 200 | 33 | `qa-a361b275-5249-41be-b3dc-e082849bcaa6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-04aa441e-ed47-4eae-8202-7142f6afa756` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-2886e3d8-e9dd-4f93-8239-1027f27d50dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df38d211-c939-4ceb-881f-e66ea8a9f88d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df38d211-c939-4ceb-881f-e66ea8a9f88d
Content-Type: application/json

--- request body ---
{"handle":"qa-422d6ffa5631","displayName":"QA 422d6ffa5631","password":"****","region":"eu"}

--- response: 201 in 464 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-df38d211-c939-4ceb-881f-e66ea8a9f88d
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
Location: /v1/accounts/qa-422d6ffa5631
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81c58aae-c679-4b30-afb9-ec60e4cb4a9d","handle":"qa-422d6ffa5631","displayName":"QA 422d6ffa5631","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.249907007Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c68005fa-9260-4285-9139-a7946acd8d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c68005fa-9260-4285-9139-a7946acd8d99
Content-Type: application/json

--- request body ---
{"handle":"qa-422d6ffa5631","password":"****","ttlSeconds":1}

--- response: 200 in 54 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c68005fa-9260-4285-9139-a7946acd8d99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_81c58aae-c679-4b30-afb9-ec60e4cb4a9d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c94f4c7-a116-408c-b3a3-2da4add1e3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c94f4c7-a116-408c-b3a3-2da4add1e3fc
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c94f4c7-a116-408c-b3a3-2da4add1e3fc
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

{"id":"acc_81c58aae-c679-4b30-afb9-ec60e4cb4a9d","handle":"qa-422d6ffa5631","displayName":"QA 422d6ffa5631","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.249907007Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c46888a-a521-4552-9db9-c36f83fe40d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c46888a-a521-4552-9db9-c36f83fe40d2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c46888a-a521-4552-9db9-c36f83fe40d2
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

{"id":"acc_81c58aae-c679-4b30-afb9-ec60e4cb4a9d","handle":"qa-422d6ffa5631","displayName":"QA 422d6ffa5631","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.249907007Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bc0ce0a-3f21-44ac-84fb-694b41c783d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc0ce0a-3f21-44ac-84fb-694b41c783d1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc0ce0a-3f21-44ac-84fb-694b41c783d1
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
Content-Length: 181

{"id":"acc_81c58aae-c679-4b30-afb9-ec60e4cb4a9d","handle":"qa-422d6ffa5631","displayName":"QA 422d6ffa5631","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.249907007Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a37217f-1dae-4820-ba93-de4c021ca772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a37217f-1dae-4820-ba93-de4c021ca772
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a37217f-1dae-4820-ba93-de4c021ca772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-9a37217f-1dae-4820-ba93-de4c021ca772"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-176f1043-242a-4080-af15-a7a0aff34e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176f1043-242a-4080-af15-a7a0aff34e43
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-176f1043-242a-4080-af15-a7a0aff34e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-176f1043-242a-4080-af15-a7a0aff34e43"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a361b275-5249-41be-b3dc-e082849bcaa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a361b275-5249-41be-b3dc-e082849bcaa6
Content-Type: application/json

--- request body ---
{"handle":"qa-422d6ffa5631","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a361b275-5249-41be-b3dc-e082849bcaa6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81c58aae-c679-4b30-afb9-ec60e4cb4a9d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04aa441e-ed47-4eae-8202-7142f6afa756

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04aa441e-ed47-4eae-8202-7142f6afa756
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04aa441e-ed47-4eae-8202-7142f6afa756
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2886e3d8-e9dd-4f93-8239-1027f27d50dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2886e3d8-e9dd-4f93-8239-1027f27d50dc
Content-Type: application/json

--- request body ---
{"handle":"qa-422d6ffa5631","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2886e3d8-e9dd-4f93-8239-1027f27d50dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2886e3d8-e9dd-4f93-8239-1027f27d50dc"}
```
