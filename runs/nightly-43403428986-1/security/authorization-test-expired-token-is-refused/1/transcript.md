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
| 1 | `POST /v1/accounts` | 201 | 427 | `qa-74efa18d-3be5-4239-9489-e225771746d1` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-cc99791c-4365-44dd-bcb4-a700d73ad1cd` |
| 3 | `GET /v1/accounts/me` | 200 | 16 | `qa-996a1938-9292-4cc4-a209-367a28ab9879` |
| 4 | `GET /v1/accounts/me` | 200 | 18 | `qa-0cc80267-651b-4401-bda9-3c67c3bb035f` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-d1e25f05-b792-46b6-84b0-58f3dc1d5a07` |
| 6 | `GET /v1/accounts/me` | 401 | 8 | `qa-71927ee5-77f7-47be-b6c6-35c947b220ce` |
| 7 | `GET /v1/accounts/me` | 401 | 7 | `qa-cdf93f33-4897-40b3-9fd8-844453261ccb` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-d4a2d244-250d-405b-aaf4-0e379fd72249` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-df23e5d7-d15d-4110-b50a-440c5f0ce015` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-73f4cbc9-6c2c-4427-945d-e65ebe227772` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-74efa18d-3be5-4239-9489-e225771746d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74efa18d-3be5-4239-9489-e225771746d1
Content-Type: application/json

--- request body ---
{"handle":"qa-aa546be03463","displayName":"QA aa546be03463","password":"****","region":"eu"}

--- response: 201 in 427 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-74efa18d-3be5-4239-9489-e225771746d1
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
Location: /v1/accounts/qa-aa546be03463
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc12154c-1281-4057-8d67-184a08e3f1b2","handle":"qa-aa546be03463","displayName":"QA aa546be03463","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.655684091Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cc99791c-4365-44dd-bcb4-a700d73ad1cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc99791c-4365-44dd-bcb4-a700d73ad1cd
Content-Type: application/json

--- request body ---
{"handle":"qa-aa546be03463","password":"****","ttlSeconds":1}

--- response: 200 in 55 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc99791c-4365-44dd-bcb4-a700d73ad1cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_bc12154c-1281-4057-8d67-184a08e3f1b2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-996a1938-9292-4cc4-a209-367a28ab9879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-996a1938-9292-4cc4-a209-367a28ab9879
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-996a1938-9292-4cc4-a209-367a28ab9879
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

{"id":"acc_bc12154c-1281-4057-8d67-184a08e3f1b2","handle":"qa-aa546be03463","displayName":"QA aa546be03463","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.655684091Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0cc80267-651b-4401-bda9-3c67c3bb035f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc80267-651b-4401-bda9-3c67c3bb035f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cc80267-651b-4401-bda9-3c67c3bb035f
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

{"id":"acc_bc12154c-1281-4057-8d67-184a08e3f1b2","handle":"qa-aa546be03463","displayName":"QA aa546be03463","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.655684091Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1e25f05-b792-46b6-84b0-58f3dc1d5a07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e25f05-b792-46b6-84b0-58f3dc1d5a07
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1e25f05-b792-46b6-84b0-58f3dc1d5a07
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

{"id":"acc_bc12154c-1281-4057-8d67-184a08e3f1b2","handle":"qa-aa546be03463","displayName":"QA aa546be03463","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.655684091Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-71927ee5-77f7-47be-b6c6-35c947b220ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71927ee5-77f7-47be-b6c6-35c947b220ce
Content-Type: application/json

--- response: 401 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71927ee5-77f7-47be-b6c6-35c947b220ce
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-71927ee5-77f7-47be-b6c6-35c947b220ce"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdf93f33-4897-40b3-9fd8-844453261ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdf93f33-4897-40b3-9fd8-844453261ccb
Content-Type: application/json

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdf93f33-4897-40b3-9fd8-844453261ccb
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-cdf93f33-4897-40b3-9fd8-844453261ccb"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d4a2d244-250d-405b-aaf4-0e379fd72249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4a2d244-250d-405b-aaf4-0e379fd72249
Content-Type: application/json

--- request body ---
{"handle":"qa-aa546be03463","password":"****"}

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4a2d244-250d-405b-aaf4-0e379fd72249
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc12154c-1281-4057-8d67-184a08e3f1b2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df23e5d7-d15d-4110-b50a-440c5f0ce015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df23e5d7-d15d-4110-b50a-440c5f0ce015
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-df23e5d7-d15d-4110-b50a-440c5f0ce015
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
correlation: qa-73f4cbc9-6c2c-4427-945d-e65ebe227772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73f4cbc9-6c2c-4427-945d-e65ebe227772
Content-Type: application/json

--- request body ---
{"handle":"qa-aa546be03463","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73f4cbc9-6c2c-4427-945d-e65ebe227772
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73f4cbc9-6c2c-4427-945d-e65ebe227772"}
```
