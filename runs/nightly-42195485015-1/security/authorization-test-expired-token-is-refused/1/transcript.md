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
| 1 | `POST /v1/accounts` | 201 | 402 | `qa-239847f8-5bd3-4efc-82b9-5b73ae733ac1` |
| 2 | `POST /v1/auth/token` | 200 | 222 | `qa-92c41b07-5df5-4509-a782-3000f3ad4fdf` |
| 3 | `GET /v1/accounts/me` | 200 | 19 | `qa-8321237f-bf71-49da-90fa-b744382b8244` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-50a23360-5f60-490a-8477-d4e4ef0d253c` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-bd7bff07-493c-439e-82f5-135d20791851` |
| 6 | `GET /v1/accounts/me` | 401 | 11 | `qa-d85baf18-1372-4332-a303-156a9665cb14` |
| 7 | `GET /v1/accounts/me` | 401 | 16 | `qa-11b1db6b-53e8-48d3-97d8-033dfbc4fc0c` |
| 8 | `POST /v1/auth/token` | 200 | 23 | `qa-d2005b9a-c29d-47bd-a0e6-f131e0fc8813` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-091a9db8-8b39-40ab-ab21-c98679ad708d` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-24042108-c76f-4db8-b4a4-e7c9b2233875` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-239847f8-5bd3-4efc-82b9-5b73ae733ac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-239847f8-5bd3-4efc-82b9-5b73ae733ac1
Content-Type: application/json

--- request body ---
{"handle":"qa-933c5b967494","displayName":"QA 933c5b967494","password":"****","region":"eu"}

--- response: 201 in 402 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-239847f8-5bd3-4efc-82b9-5b73ae733ac1
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
Location: /v1/accounts/qa-933c5b967494
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad3c38c4-7f07-4144-8dc9-3f750a48ebfa","handle":"qa-933c5b967494","displayName":"QA 933c5b967494","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.125275386Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-92c41b07-5df5-4509-a782-3000f3ad4fdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c41b07-5df5-4509-a782-3000f3ad4fdf
Content-Type: application/json

--- request body ---
{"handle":"qa-933c5b967494","password":"****","ttlSeconds":1}

--- response: 200 in 222 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-92c41b07-5df5-4509-a782-3000f3ad4fdf
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_ad3c38c4-7f07-4144-8dc9-3f750a48ebfa"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8321237f-bf71-49da-90fa-b744382b8244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8321237f-bf71-49da-90fa-b744382b8244
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8321237f-bf71-49da-90fa-b744382b8244
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

{"id":"acc_ad3c38c4-7f07-4144-8dc9-3f750a48ebfa","handle":"qa-933c5b967494","displayName":"QA 933c5b967494","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.125275386Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-50a23360-5f60-490a-8477-d4e4ef0d253c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a23360-5f60-490a-8477-d4e4ef0d253c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-50a23360-5f60-490a-8477-d4e4ef0d253c
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

{"id":"acc_ad3c38c4-7f07-4144-8dc9-3f750a48ebfa","handle":"qa-933c5b967494","displayName":"QA 933c5b967494","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.125275386Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd7bff07-493c-439e-82f5-135d20791851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd7bff07-493c-439e-82f5-135d20791851
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd7bff07-493c-439e-82f5-135d20791851
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

{"id":"acc_ad3c38c4-7f07-4144-8dc9-3f750a48ebfa","handle":"qa-933c5b967494","displayName":"QA 933c5b967494","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.125275386Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-d85baf18-1372-4332-a303-156a9665cb14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d85baf18-1372-4332-a303-156a9665cb14
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d85baf18-1372-4332-a303-156a9665cb14
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-d85baf18-1372-4332-a303-156a9665cb14"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-11b1db6b-53e8-48d3-97d8-033dfbc4fc0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11b1db6b-53e8-48d3-97d8-033dfbc4fc0c
Content-Type: application/json

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11b1db6b-53e8-48d3-97d8-033dfbc4fc0c
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-11b1db6b-53e8-48d3-97d8-033dfbc4fc0c"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d2005b9a-c29d-47bd-a0e6-f131e0fc8813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2005b9a-c29d-47bd-a0e6-f131e0fc8813
Content-Type: application/json

--- request body ---
{"handle":"qa-933c5b967494","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2005b9a-c29d-47bd-a0e6-f131e0fc8813
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad3c38c4-7f07-4144-8dc9-3f750a48ebfa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-091a9db8-8b39-40ab-ab21-c98679ad708d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-091a9db8-8b39-40ab-ab21-c98679ad708d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-091a9db8-8b39-40ab-ab21-c98679ad708d
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
correlation: qa-24042108-c76f-4db8-b4a4-e7c9b2233875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24042108-c76f-4db8-b4a4-e7c9b2233875
Content-Type: application/json

--- request body ---
{"handle":"qa-933c5b967494","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24042108-c76f-4db8-b4a4-e7c9b2233875
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24042108-c76f-4db8-b4a4-e7c9b2233875"}
```
