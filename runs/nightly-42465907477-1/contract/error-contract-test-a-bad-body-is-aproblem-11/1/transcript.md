# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-56b07492-9264-44ad-bab4-f2ca774af47f` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-420beb22-6db8-46a9-9cec-657dc398ae8b` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-3d209bf7-c440-4943-8f2f-6a9a87f783cd` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-bc84ab81-6e0d-480d-9d5e-c54231ead394` |
| 5 | `POST /v1/conversations` | 422 | 3 | `qa-95cb1f24-78d0-45e4-ab7f-549f8704d69d` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-3a6bcceb-0501-4977-b283-19434f2057ae` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9e05ed09-6951-462e-9f58-e99dc45d7c79` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-53ce9bb8-2e26-40a0-b410-4e3c60eca820` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-95988a52-15ce-4ad6-9fca-948e71b9f97e` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-64a85be4-7c4e-4d8f-be8c-1382104794c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56b07492-9264-44ad-bab4-f2ca774af47f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56b07492-9264-44ad-bab4-f2ca774af47f
Content-Type: application/json

--- request body ---
{"handle":"qa-171059c30c13","displayName":"QA 171059c30c13","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-56b07492-9264-44ad-bab4-f2ca774af47f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Location: /v1/accounts/qa-171059c30c13
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3efc2991-f499-4004-9f01-d511f7619278","handle":"qa-171059c30c13","displayName":"QA 171059c30c13","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.126758992Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-420beb22-6db8-46a9-9cec-657dc398ae8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420beb22-6db8-46a9-9cec-657dc398ae8b
Content-Type: application/json

--- request body ---
{"handle":"qa-8d4171cf4659","displayName":"QA 8d4171cf4659","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-420beb22-6db8-46a9-9cec-657dc398ae8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Location: /v1/accounts/qa-8d4171cf4659
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb646354-77cb-4dd7-b91a-e5d660037701","handle":"qa-8d4171cf4659","displayName":"QA 8d4171cf4659","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.166402801Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3d209bf7-c440-4943-8f2f-6a9a87f783cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d209bf7-c440-4943-8f2f-6a9a87f783cd
Content-Type: application/json

--- request body ---
{"handle":"qa-171059c30c13","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d209bf7-c440-4943-8f2f-6a9a87f783cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3efc2991-f499-4004-9f01-d511f7619278"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bc84ab81-6e0d-480d-9d5e-c54231ead394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc84ab81-6e0d-480d-9d5e-c54231ead394
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8d4171cf4659","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc84ab81-6e0d-480d-9d5e-c54231ead394
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
Location: /v1/conversations/cnv_7f613cea-ddbd-4454-9282-b652a434085a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7f613cea-ddbd-4454-9282-b652a434085a","subject":"Error contract","status":"open","region":"eu","participants":["qa-171059c30c13","qa-8d4171cf4659"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.208243851Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-95cb1f24-78d0-45e4-ab7f-549f8704d69d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95cb1f24-78d0-45e4-ab7f-549f8704d69d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8d4171cf4659","subject":" ","message":"Hi"}

--- response: 422 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95cb1f24-78d0-45e4-ab7f-549f8704d69d
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-95cb1f24-78d0-45e4-ab7f-549f8704d69d","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3a6bcceb-0501-4977-b283-19434f2057ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a6bcceb-0501-4977-b283-19434f2057ae
Content-Type: application/json

--- request body ---
{"handle":"qa-8d4171cf4659","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a6bcceb-0501-4977-b283-19434f2057ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb646354-77cb-4dd7-b91a-e5d660037701"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e05ed09-6951-462e-9f58-e99dc45d7c79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e05ed09-6951-462e-9f58-e99dc45d7c79
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e05ed09-6951-462e-9f58-e99dc45d7c79
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
correlation: qa-53ce9bb8-2e26-40a0-b410-4e3c60eca820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53ce9bb8-2e26-40a0-b410-4e3c60eca820
Content-Type: application/json

--- request body ---
{"handle":"qa-8d4171cf4659","password":"****"}

--- response: 401 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53ce9bb8-2e26-40a0-b410-4e3c60eca820
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53ce9bb8-2e26-40a0-b410-4e3c60eca820"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95988a52-15ce-4ad6-9fca-948e71b9f97e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95988a52-15ce-4ad6-9fca-948e71b9f97e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95988a52-15ce-4ad6-9fca-948e71b9f97e
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
correlation: qa-64a85be4-7c4e-4d8f-be8c-1382104794c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64a85be4-7c4e-4d8f-be8c-1382104794c8
Content-Type: application/json

--- request body ---
{"handle":"qa-171059c30c13","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64a85be4-7c4e-4d8f-be8c-1382104794c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64a85be4-7c4e-4d8f-be8c-1382104794c8"}
```
