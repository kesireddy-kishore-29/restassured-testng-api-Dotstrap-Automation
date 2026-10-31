# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-8f32a91c-dd69-4442-b004-52e56bbbe029` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-2bd96db5-a89b-4f17-b4f2-997fc82880f8` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-1daafc53-b833-4c75-9eb0-9768bc09b265` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-1cb26fd8-dff5-454b-827b-df63afa80cbf` |
| 5 | `PATCH /v1/accounts/me` | 400 | 50 | `qa-bc46daab-4a73-49cb-8da8-44ac9a1a6b1e` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-02c08485-7fdd-47a3-940a-5dfe40caa784` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9ff747ae-5c3d-4f0e-9fc7-90c7cd634e32` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-7547e74c-5406-4183-b12e-d0378237f2ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-6abc0190-041b-4ab1-99be-0f96db9ca86a` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-ece448a5-53bd-4126-80dc-8c2ffcb95503` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f32a91c-dd69-4442-b004-52e56bbbe029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f32a91c-dd69-4442-b004-52e56bbbe029
Content-Type: application/json

--- request body ---
{"handle":"qa-e810630bae16","displayName":"QA e810630bae16","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f32a91c-dd69-4442-b004-52e56bbbe029
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-e810630bae16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1876e92e-0de8-4eee-9723-767cb8cecdb5","handle":"qa-e810630bae16","displayName":"QA e810630bae16","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.560097765Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2bd96db5-a89b-4f17-b4f2-997fc82880f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bd96db5-a89b-4f17-b4f2-997fc82880f8
Content-Type: application/json

--- request body ---
{"handle":"qa-5b662dd6b707","displayName":"QA 5b662dd6b707","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bd96db5-a89b-4f17-b4f2-997fc82880f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-5b662dd6b707
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4320f37-0307-4ca4-ae1e-a3cdddfc67d4","handle":"qa-5b662dd6b707","displayName":"QA 5b662dd6b707","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.651537975Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1daafc53-b833-4c75-9eb0-9768bc09b265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1daafc53-b833-4c75-9eb0-9768bc09b265
Content-Type: application/json

--- request body ---
{"handle":"qa-e810630bae16","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1daafc53-b833-4c75-9eb0-9768bc09b265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1876e92e-0de8-4eee-9723-767cb8cecdb5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1cb26fd8-dff5-454b-827b-df63afa80cbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cb26fd8-dff5-454b-827b-df63afa80cbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b662dd6b707","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cb26fd8-dff5-454b-827b-df63afa80cbf
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
Location: /v1/conversations/cnv_96a9b3e6-ece0-417d-a7f9-3fc242c1f0f3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96a9b3e6-ece0-417d-a7f9-3fc242c1f0f3","subject":"Error contract","status":"open","region":"eu","participants":["qa-e810630bae16","qa-5b662dd6b707"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.767345975Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-bc46daab-4a73-49cb-8da8-44ac9a1a6b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc46daab-4a73-49cb-8da8-44ac9a1a6b1e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 50 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc46daab-4a73-49cb-8da8-44ac9a1a6b1e
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-bc46daab-4a73-49cb-8da8-44ac9a1a6b1e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02c08485-7fdd-47a3-940a-5dfe40caa784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c08485-7fdd-47a3-940a-5dfe40caa784
Content-Type: application/json

--- request body ---
{"handle":"qa-5b662dd6b707","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-02c08485-7fdd-47a3-940a-5dfe40caa784
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4320f37-0307-4ca4-ae1e-a3cdddfc67d4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ff747ae-5c3d-4f0e-9fc7-90c7cd634e32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ff747ae-5c3d-4f0e-9fc7-90c7cd634e32
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ff747ae-5c3d-4f0e-9fc7-90c7cd634e32
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
correlation: qa-7547e74c-5406-4183-b12e-d0378237f2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7547e74c-5406-4183-b12e-d0378237f2ee
Content-Type: application/json

--- request body ---
{"handle":"qa-5b662dd6b707","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7547e74c-5406-4183-b12e-d0378237f2ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7547e74c-5406-4183-b12e-d0378237f2ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6abc0190-041b-4ab1-99be-0f96db9ca86a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6abc0190-041b-4ab1-99be-0f96db9ca86a
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6abc0190-041b-4ab1-99be-0f96db9ca86a
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
correlation: qa-ece448a5-53bd-4126-80dc-8c2ffcb95503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ece448a5-53bd-4126-80dc-8c2ffcb95503
Content-Type: application/json

--- request body ---
{"handle":"qa-e810630bae16","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ece448a5-53bd-4126-80dc-8c2ffcb95503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ece448a5-53bd-4126-80dc-8c2ffcb95503"}
```
