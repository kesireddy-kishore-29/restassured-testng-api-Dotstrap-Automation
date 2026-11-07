# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-dfe5a324-e869-4674-9d42-3579c4d39637` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-a8c4c56a-7867-4202-a902-481500a0f2fc` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-b4194578-b350-478f-9f1c-4111db81446c` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-b70c5d0b-d91e-446e-a7b2-f17bd1ea4224` |
| 5 | `POST /v1/credits/purchases` | 422 | 22 | `qa-406682ab-506d-4f13-92bd-f3581192fb03` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-a43c60e7-f20b-4352-b378-309fd6d2d688` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-adb8e153-8dfa-423d-b85a-b50dfdaf0e30` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-8ada522d-abfd-4842-b4bb-1285a69bb4e1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f67e83d8-4295-4f44-b538-7e4aac37545f` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-b2a01557-2487-4cf0-8ad6-c32c9204fee9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dfe5a324-e869-4674-9d42-3579c4d39637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe5a324-e869-4674-9d42-3579c4d39637
Content-Type: application/json

--- request body ---
{"handle":"qa-cae1bdc54169","displayName":"QA cae1bdc54169","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfe5a324-e869-4674-9d42-3579c4d39637
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Location: /v1/accounts/qa-cae1bdc54169
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66c3ce85-b0fa-4ab6-8675-45fe5ff33e6d","handle":"qa-cae1bdc54169","displayName":"QA cae1bdc54169","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.668445710Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8c4c56a-7867-4202-a902-481500a0f2fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c4c56a-7867-4202-a902-481500a0f2fc
Content-Type: application/json

--- request body ---
{"handle":"qa-9c1c80fb6105","displayName":"QA 9c1c80fb6105","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c4c56a-7867-4202-a902-481500a0f2fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Location: /v1/accounts/qa-9c1c80fb6105
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98c0f9e3-b11d-4c2f-b387-1c4b9fc1c1db","handle":"qa-9c1c80fb6105","displayName":"QA 9c1c80fb6105","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.717544381Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b4194578-b350-478f-9f1c-4111db81446c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4194578-b350-478f-9f1c-4111db81446c
Content-Type: application/json

--- request body ---
{"handle":"qa-cae1bdc54169","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4194578-b350-478f-9f1c-4111db81446c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66c3ce85-b0fa-4ab6-8675-45fe5ff33e6d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b70c5d0b-d91e-446e-a7b2-f17bd1ea4224

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b70c5d0b-d91e-446e-a7b2-f17bd1ea4224
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c1c80fb6105","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b70c5d0b-d91e-446e-a7b2-f17bd1ea4224
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
Location: /v1/conversations/cnv_4ca50813-f895-455c-9624-ec29f249a85d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4ca50813-f895-455c-9624-ec29f249a85d","subject":"Error contract","status":"open","region":"eu","participants":["qa-cae1bdc54169","qa-9c1c80fb6105"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.782789230Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-406682ab-506d-4f13-92bd-f3581192fb03

--- request headers ---
Accept: application/json
Idempotency-Key: qa-97ecbeff42544c7d9c4b31dd566cdc0f
X-Correlation-Id: qa-406682ab-506d-4f13-92bd-f3581192fb03
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-406682ab-506d-4f13-92bd-f3581192fb03
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-406682ab-506d-4f13-92bd-f3581192fb03","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a43c60e7-f20b-4352-b378-309fd6d2d688

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a43c60e7-f20b-4352-b378-309fd6d2d688
Content-Type: application/json

--- request body ---
{"handle":"qa-9c1c80fb6105","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a43c60e7-f20b-4352-b378-309fd6d2d688
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98c0f9e3-b11d-4c2f-b387-1c4b9fc1c1db"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adb8e153-8dfa-423d-b85a-b50dfdaf0e30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adb8e153-8dfa-423d-b85a-b50dfdaf0e30
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adb8e153-8dfa-423d-b85a-b50dfdaf0e30
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
correlation: qa-8ada522d-abfd-4842-b4bb-1285a69bb4e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ada522d-abfd-4842-b4bb-1285a69bb4e1
Content-Type: application/json

--- request body ---
{"handle":"qa-9c1c80fb6105","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ada522d-abfd-4842-b4bb-1285a69bb4e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ada522d-abfd-4842-b4bb-1285a69bb4e1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f67e83d8-4295-4f44-b538-7e4aac37545f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f67e83d8-4295-4f44-b538-7e4aac37545f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f67e83d8-4295-4f44-b538-7e4aac37545f
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
correlation: qa-b2a01557-2487-4cf0-8ad6-c32c9204fee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a01557-2487-4cf0-8ad6-c32c9204fee9
Content-Type: application/json

--- request body ---
{"handle":"qa-cae1bdc54169","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2a01557-2487-4cf0-8ad6-c32c9204fee9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2a01557-2487-4cf0-8ad6-c32c9204fee9"}
```
