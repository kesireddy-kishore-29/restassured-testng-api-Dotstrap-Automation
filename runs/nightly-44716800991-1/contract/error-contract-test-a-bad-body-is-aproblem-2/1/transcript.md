# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 84 | `qa-f423a8b2-15ad-4142-a246-6e11ef70c4e0` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-f0d897a4-2779-46ef-b9e0-66aa6db18267` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-c6337b06-3415-493f-8c46-d5e81c561924` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-a15d1d71-882d-4010-a361-8a29a311ef66` |
| 5 | `POST /v1/auth/token` | 422 | 28 | `qa-4840eede-3d5d-47c5-875e-d4bd789c5f5f` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-fea6804e-2afe-4ad8-8293-6a5dd76935b2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 69 | `qa-7f473c41-a2e8-44cf-b336-8822f1d31342` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-eaccae11-3090-478e-b947-d94c7c1eb769` |
| 9 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-917032e3-f51f-41ab-ab73-1298f852306c` |
| 10 | `POST /v1/auth/token` | 401 | 46 | `qa-31300dde-62a3-4780-8197-020ee471304e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f423a8b2-15ad-4142-a246-6e11ef70c4e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f423a8b2-15ad-4142-a246-6e11ef70c4e0
Content-Type: application/json

--- request body ---
{"handle":"qa-434c8bd8b0db","displayName":"QA 434c8bd8b0db","password":"****","region":"eu"}

--- response: 201 in 84 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f423a8b2-15ad-4142-a246-6e11ef70c4e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-434c8bd8b0db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a0d05b7-a9f0-46c0-b75a-3734a41d31de","handle":"qa-434c8bd8b0db","displayName":"QA 434c8bd8b0db","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.444113766Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0d897a4-2779-46ef-b9e0-66aa6db18267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d897a4-2779-46ef-b9e0-66aa6db18267
Content-Type: application/json

--- request body ---
{"handle":"qa-fb6e81d063ea","displayName":"QA fb6e81d063ea","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0d897a4-2779-46ef-b9e0-66aa6db18267
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-fb6e81d063ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb87565c-b4d5-4e6e-9f33-3828188aba17","handle":"qa-fb6e81d063ea","displayName":"QA fb6e81d063ea","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.549856813Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6337b06-3415-493f-8c46-d5e81c561924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6337b06-3415-493f-8c46-d5e81c561924
Content-Type: application/json

--- request body ---
{"handle":"qa-434c8bd8b0db","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6337b06-3415-493f-8c46-d5e81c561924
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a0d05b7-a9f0-46c0-b75a-3734a41d31de"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a15d1d71-882d-4010-a361-8a29a311ef66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a15d1d71-882d-4010-a361-8a29a311ef66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fb6e81d063ea","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a15d1d71-882d-4010-a361-8a29a311ef66
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
Location: /v1/conversations/cnv_6e39cc30-4cd1-4d9a-96d4-22ffe83e5e61
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6e39cc30-4cd1-4d9a-96d4-22ffe83e5e61","subject":"Error contract","status":"open","region":"eu","participants":["qa-434c8bd8b0db","qa-fb6e81d063ea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.650015024Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4840eede-3d5d-47c5-875e-d4bd789c5f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4840eede-3d5d-47c5-875e-d4bd789c5f5f
Content-Type: application/json

--- request body ---
{"handle":"qa-434c8bd8b0db","password":"****","ttlSeconds":0}

--- response: 422 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4840eede-3d5d-47c5-875e-d4bd789c5f5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-4840eede-3d5d-47c5-875e-d4bd789c5f5f","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fea6804e-2afe-4ad8-8293-6a5dd76935b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fea6804e-2afe-4ad8-8293-6a5dd76935b2
Content-Type: application/json

--- request body ---
{"handle":"qa-fb6e81d063ea","password":"****"}

--- response: 200 in 56 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fea6804e-2afe-4ad8-8293-6a5dd76935b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb87565c-b4d5-4e6e-9f33-3828188aba17"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f473c41-a2e8-44cf-b336-8822f1d31342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f473c41-a2e8-44cf-b336-8822f1d31342
Content-Type: application/json

--- response: 204 in 69 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f473c41-a2e8-44cf-b336-8822f1d31342
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
correlation: qa-eaccae11-3090-478e-b947-d94c7c1eb769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaccae11-3090-478e-b947-d94c7c1eb769
Content-Type: application/json

--- request body ---
{"handle":"qa-fb6e81d063ea","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eaccae11-3090-478e-b947-d94c7c1eb769
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eaccae11-3090-478e-b947-d94c7c1eb769"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-917032e3-f51f-41ab-ab73-1298f852306c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-917032e3-f51f-41ab-ab73-1298f852306c
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-917032e3-f51f-41ab-ab73-1298f852306c
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-31300dde-62a3-4780-8197-020ee471304e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31300dde-62a3-4780-8197-020ee471304e
Content-Type: application/json

--- request body ---
{"handle":"qa-434c8bd8b0db","password":"****"}

--- response: 401 in 46 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31300dde-62a3-4780-8197-020ee471304e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31300dde-62a3-4780-8197-020ee471304e"}
```
