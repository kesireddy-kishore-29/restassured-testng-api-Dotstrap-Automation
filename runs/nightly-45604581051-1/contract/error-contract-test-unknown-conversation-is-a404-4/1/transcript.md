# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-67ea0144-3bf0-4944-bbd9-66b03670ccac` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-a303772b-04c8-4c39-9a05-2379c98f78b2` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 8 | `qa-2147eb7b-1e22-44a6-b62a-ed662aab3a32` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-aa1e86a6-0987-4a56-9d61-17304a72e8e7` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-c161329b-d012-4a13-ad9d-d08fd75be66d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-67ea0144-3bf0-4944-bbd9-66b03670ccac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67ea0144-3bf0-4944-bbd9-66b03670ccac
Content-Type: application/json

--- request body ---
{"handle":"qa-a1632a4f24c8","displayName":"QA a1632a4f24c8","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-67ea0144-3bf0-4944-bbd9-66b03670ccac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Location: /v1/accounts/qa-a1632a4f24c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_331520c3-781d-4e2c-b1c2-a0032b9e7e63","handle":"qa-a1632a4f24c8","displayName":"QA a1632a4f24c8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.970829747Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a303772b-04c8-4c39-9a05-2379c98f78b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a303772b-04c8-4c39-9a05-2379c98f78b2
Content-Type: application/json

--- request body ---
{"handle":"qa-a1632a4f24c8","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a303772b-04c8-4c39-9a05-2379c98f78b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_331520c3-781d-4e2c-b1c2-a0032b9e7e63"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-2147eb7b-1e22-44a6-b62a-ed662aab3a32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2147eb7b-1e22-44a6-b62a-ed662aab3a32
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2147eb7b-1e22-44a6-b62a-ed662aab3a32
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-2147eb7b-1e22-44a6-b62a-ed662aab3a32"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa1e86a6-0987-4a56-9d61-17304a72e8e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa1e86a6-0987-4a56-9d61-17304a72e8e7
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa1e86a6-0987-4a56-9d61-17304a72e8e7
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
correlation: qa-c161329b-d012-4a13-ad9d-d08fd75be66d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c161329b-d012-4a13-ad9d-d08fd75be66d
Content-Type: application/json

--- request body ---
{"handle":"qa-a1632a4f24c8","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c161329b-d012-4a13-ad9d-d08fd75be66d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c161329b-d012-4a13-ad9d-d08fd75be66d"}
```
