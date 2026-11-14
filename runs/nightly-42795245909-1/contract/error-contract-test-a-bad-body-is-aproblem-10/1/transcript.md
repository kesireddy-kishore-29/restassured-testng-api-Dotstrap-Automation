# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-8b2c1969-8bc8-4660-8692-efc135ff39fb` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-421cf3cf-ae6d-4ea1-8c07-2a2fa5c8d4f0` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-58361792-69f6-47e8-9aab-6266da9155e1` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-cfcb31bf-eb9d-4105-b8e0-6dd64285aa5f` |
| 5 | `POST /v1/conversations` | 415 | 8 | `qa-20487922-33b2-4802-981d-7c754879ce92` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-846a1dd7-743d-46b6-b284-58b99ddb87af` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-05e2284a-90dc-4541-967b-4c131faf2839` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-76ac7b59-2321-4a1e-8bc0-435d08792cf5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-204fe957-67c1-4cc4-abe6-d8a3a941fe86` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-92c9f720-5df8-4422-b715-ed19b8608b3d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b2c1969-8bc8-4660-8692-efc135ff39fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b2c1969-8bc8-4660-8692-efc135ff39fb
Content-Type: application/json

--- request body ---
{"handle":"qa-83ec7b0eae1d","displayName":"QA 83ec7b0eae1d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b2c1969-8bc8-4660-8692-efc135ff39fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-83ec7b0eae1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b21ae05e-4735-46ff-a3bc-05daab6a742a","handle":"qa-83ec7b0eae1d","displayName":"QA 83ec7b0eae1d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.829497509Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-421cf3cf-ae6d-4ea1-8c07-2a2fa5c8d4f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-421cf3cf-ae6d-4ea1-8c07-2a2fa5c8d4f0
Content-Type: application/json

--- request body ---
{"handle":"qa-3db82b1a5348","displayName":"QA 3db82b1a5348","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-421cf3cf-ae6d-4ea1-8c07-2a2fa5c8d4f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Location: /v1/accounts/qa-3db82b1a5348
X-Served-Region: eu
Content-Length: 181

{"id":"acc_442b4c10-82cc-406c-8521-1c63f9318bc4","handle":"qa-3db82b1a5348","displayName":"QA 3db82b1a5348","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.867803458Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-58361792-69f6-47e8-9aab-6266da9155e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58361792-69f6-47e8-9aab-6266da9155e1
Content-Type: application/json

--- request body ---
{"handle":"qa-83ec7b0eae1d","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-58361792-69f6-47e8-9aab-6266da9155e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b21ae05e-4735-46ff-a3bc-05daab6a742a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cfcb31bf-eb9d-4105-b8e0-6dd64285aa5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfcb31bf-eb9d-4105-b8e0-6dd64285aa5f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3db82b1a5348","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfcb31bf-eb9d-4105-b8e0-6dd64285aa5f
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
Location: /v1/conversations/cnv_6b2e6aea-4400-4b49-bef7-87899aaefe46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b2e6aea-4400-4b49-bef7-87899aaefe46","subject":"Error contract","status":"open","region":"eu","participants":["qa-83ec7b0eae1d","qa-3db82b1a5348"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.948399047Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-20487922-33b2-4802-981d-7c754879ce92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20487922-33b2-4802-981d-7c754879ce92
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20487922-33b2-4802-981d-7c754879ce92
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-20487922-33b2-4802-981d-7c754879ce92"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-846a1dd7-743d-46b6-b284-58b99ddb87af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-846a1dd7-743d-46b6-b284-58b99ddb87af
Content-Type: application/json

--- request body ---
{"handle":"qa-3db82b1a5348","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-846a1dd7-743d-46b6-b284-58b99ddb87af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_442b4c10-82cc-406c-8521-1c63f9318bc4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05e2284a-90dc-4541-967b-4c131faf2839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e2284a-90dc-4541-967b-4c131faf2839
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05e2284a-90dc-4541-967b-4c131faf2839
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-76ac7b59-2321-4a1e-8bc0-435d08792cf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ac7b59-2321-4a1e-8bc0-435d08792cf5
Content-Type: application/json

--- request body ---
{"handle":"qa-3db82b1a5348","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76ac7b59-2321-4a1e-8bc0-435d08792cf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76ac7b59-2321-4a1e-8bc0-435d08792cf5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-204fe957-67c1-4cc4-abe6-d8a3a941fe86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-204fe957-67c1-4cc4-abe6-d8a3a941fe86
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-204fe957-67c1-4cc4-abe6-d8a3a941fe86
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-92c9f720-5df8-4422-b715-ed19b8608b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c9f720-5df8-4422-b715-ed19b8608b3d
Content-Type: application/json

--- request body ---
{"handle":"qa-83ec7b0eae1d","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92c9f720-5df8-4422-b715-ed19b8608b3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92c9f720-5df8-4422-b715-ed19b8608b3d"}
```
