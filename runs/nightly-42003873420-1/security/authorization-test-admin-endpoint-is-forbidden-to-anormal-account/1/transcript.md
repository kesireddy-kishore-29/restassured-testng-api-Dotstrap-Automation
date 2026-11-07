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
| 1 | `POST /v1/accounts` | 201 | 473 | `qa-cb7f1ee5-2c61-452b-ae74-bd6cdbb189b9` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-2acac99b-01e2-4f6b-8ef6-fb98ba09beab` |
| 3 | `GET /v1/admin/stats` | 403 | 56 | `qa-046fb7b8-f821-4b8a-83c3-e46056f79767` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-40a2b2d5-6afb-4f6d-93a1-39f970ad0a3b` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-83cf7076-b4d1-47c5-a320-9c50b6c54ba4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb7f1ee5-2c61-452b-ae74-bd6cdbb189b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb7f1ee5-2c61-452b-ae74-bd6cdbb189b9
Content-Type: application/json

--- request body ---
{"handle":"qa-0747e61c836c","displayName":"QA 0747e61c836c","password":"****","region":"eu"}

--- response: 201 in 473 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb7f1ee5-2c61-452b-ae74-bd6cdbb189b9
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
Location: /v1/accounts/qa-0747e61c836c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64db6c71-0840-44d6-99c9-8302abdde395","handle":"qa-0747e61c836c","displayName":"QA 0747e61c836c","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.522653931Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2acac99b-01e2-4f6b-8ef6-fb98ba09beab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2acac99b-01e2-4f6b-8ef6-fb98ba09beab
Content-Type: application/json

--- request body ---
{"handle":"qa-0747e61c836c","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-2acac99b-01e2-4f6b-8ef6-fb98ba09beab
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64db6c71-0840-44d6-99c9-8302abdde395"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-046fb7b8-f821-4b8a-83c3-e46056f79767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-046fb7b8-f821-4b8a-83c3-e46056f79767
Content-Type: application/json

--- response: 403 in 56 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-046fb7b8-f821-4b8a-83c3-e46056f79767
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-046fb7b8-f821-4b8a-83c3-e46056f79767"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40a2b2d5-6afb-4f6d-93a1-39f970ad0a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40a2b2d5-6afb-4f6d-93a1-39f970ad0a3b
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40a2b2d5-6afb-4f6d-93a1-39f970ad0a3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-83cf7076-b4d1-47c5-a320-9c50b6c54ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83cf7076-b4d1-47c5-a320-9c50b6c54ba4
Content-Type: application/json

--- request body ---
{"handle":"qa-0747e61c836c","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83cf7076-b4d1-47c5-a320-9c50b6c54ba4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83cf7076-b4d1-47c5-a320-9c50b6c54ba4"}
```
