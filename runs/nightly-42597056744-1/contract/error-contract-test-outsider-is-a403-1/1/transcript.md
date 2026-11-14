# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-ebc3a93f-b4e7-44ca-bee5-310822d4ea44` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-f2bb350b-02c0-4674-b334-70e968090537` |
| 3 | `POST /v1/accounts` | 201 | 14 | `qa-81b17ca1-24b7-4487-b760-84bd7c58d70d` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-5d443fb3-e02a-4140-9da7-aba0d2fd9cb6` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-8425f325-da08-4db4-9cf3-2d864f9330cb` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-0d545d6b-49bd-47db-8b11-4f9195b2cb34` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-3eafa32a-e66d-4f2b-b4d6-be82fef61ad0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-8421fab8-b09b-4843-8d11-a633131a56fb` |
| 9 | `POST /v1/auth/token` | 401 | 40 | `qa-907c7fac-a287-4c82-8112-3c4b42538fcd` |
| 10 | `POST /v1/auth/token` | 200 | 30 | `qa-206d4b90-6bf9-4ab7-b45b-df0f79781de4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-539a6d7f-b345-4504-a62f-6520927cf8d1` |
| 12 | `POST /v1/auth/token` | 401 | 18 | `qa-ce8bd7f9-5bcc-4ab5-baa7-25de1a0273cb` |
| 13 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-d759f680-5f57-4941-b849-583090afdeb0` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-a13fbdb8-7799-4d95-bcc6-08df971a78a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ebc3a93f-b4e7-44ca-bee5-310822d4ea44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebc3a93f-b4e7-44ca-bee5-310822d4ea44
Content-Type: application/json

--- request body ---
{"handle":"qa-b79589d10b33","displayName":"QA b79589d10b33","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebc3a93f-b4e7-44ca-bee5-310822d4ea44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Location: /v1/accounts/qa-b79589d10b33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21eaa95b-ff45-4b6e-8b90-ad7a817c2a78","handle":"qa-b79589d10b33","displayName":"QA b79589d10b33","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.960692473Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2bb350b-02c0-4674-b334-70e968090537

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2bb350b-02c0-4674-b334-70e968090537
Content-Type: application/json

--- request body ---
{"handle":"qa-85f26baafc7d","displayName":"QA 85f26baafc7d","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2bb350b-02c0-4674-b334-70e968090537
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Location: /v1/accounts/qa-85f26baafc7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_73d45beb-2cb7-44f5-91e0-ab425f7c2205","handle":"qa-85f26baafc7d","displayName":"QA 85f26baafc7d","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.021510751Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-81b17ca1-24b7-4487-b760-84bd7c58d70d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b17ca1-24b7-4487-b760-84bd7c58d70d
Content-Type: application/json

--- request body ---
{"handle":"qa-46a819a22f73","displayName":"QA 46a819a22f73","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-81b17ca1-24b7-4487-b760-84bd7c58d70d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 10
Location: /v1/accounts/qa-46a819a22f73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c5d7d85-9387-4036-8c55-25fd6f476701","handle":"qa-46a819a22f73","displayName":"QA 46a819a22f73","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.050358974Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5d443fb3-e02a-4140-9da7-aba0d2fd9cb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d443fb3-e02a-4140-9da7-aba0d2fd9cb6
Content-Type: application/json

--- request body ---
{"handle":"qa-b79589d10b33","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d443fb3-e02a-4140-9da7-aba0d2fd9cb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21eaa95b-ff45-4b6e-8b90-ad7a817c2a78"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8425f325-da08-4db4-9cf3-2d864f9330cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8425f325-da08-4db4-9cf3-2d864f9330cb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-85f26baafc7d","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8425f325-da08-4db4-9cf3-2d864f9330cb
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
Location: /v1/conversations/cnv_493ff1dd-2953-40ec-8713-fed6e3c64461
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_493ff1dd-2953-40ec-8713-fed6e3c64461","subject":"Error contract","status":"open","region":"eu","participants":["qa-b79589d10b33","qa-85f26baafc7d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.093066573Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d545d6b-49bd-47db-8b11-4f9195b2cb34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d545d6b-49bd-47db-8b11-4f9195b2cb34
Content-Type: application/json

--- request body ---
{"handle":"qa-46a819a22f73","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d545d6b-49bd-47db-8b11-4f9195b2cb34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c5d7d85-9387-4036-8c55-25fd6f476701"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_493ff1dd-2953-40ec-8713-fed6e3c64461/messages
correlation: qa-3eafa32a-e66d-4f2b-b4d6-be82fef61ad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eafa32a-e66d-4f2b-b4d6-be82fef61ad0
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3eafa32a-e66d-4f2b-b4d6-be82fef61ad0
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_493ff1dd-2953-40ec-8713-fed6e3c64461/messages","correlationId":"qa-3eafa32a-e66d-4f2b-b4d6-be82fef61ad0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8421fab8-b09b-4843-8d11-a633131a56fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8421fab8-b09b-4843-8d11-a633131a56fb
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8421fab8-b09b-4843-8d11-a633131a56fb
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-907c7fac-a287-4c82-8112-3c4b42538fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-907c7fac-a287-4c82-8112-3c4b42538fcd
Content-Type: application/json

--- request body ---
{"handle":"qa-46a819a22f73","password":"****"}

--- response: 401 in 40 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-907c7fac-a287-4c82-8112-3c4b42538fcd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-907c7fac-a287-4c82-8112-3c4b42538fcd"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-206d4b90-6bf9-4ab7-b45b-df0f79781de4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-206d4b90-6bf9-4ab7-b45b-df0f79781de4
Content-Type: application/json

--- request body ---
{"handle":"qa-85f26baafc7d","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-206d4b90-6bf9-4ab7-b45b-df0f79781de4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73d45beb-2cb7-44f5-91e0-ab425f7c2205"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-539a6d7f-b345-4504-a62f-6520927cf8d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539a6d7f-b345-4504-a62f-6520927cf8d1
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-539a6d7f-b345-4504-a62f-6520927cf8d1
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-ce8bd7f9-5bcc-4ab5-baa7-25de1a0273cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8bd7f9-5bcc-4ab5-baa7-25de1a0273cb
Content-Type: application/json

--- request body ---
{"handle":"qa-85f26baafc7d","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce8bd7f9-5bcc-4ab5-baa7-25de1a0273cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce8bd7f9-5bcc-4ab5-baa7-25de1a0273cb"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d759f680-5f57-4941-b849-583090afdeb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d759f680-5f57-4941-b849-583090afdeb0
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d759f680-5f57-4941-b849-583090afdeb0
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-a13fbdb8-7799-4d95-bcc6-08df971a78a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a13fbdb8-7799-4d95-bcc6-08df971a78a8
Content-Type: application/json

--- request body ---
{"handle":"qa-b79589d10b33","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a13fbdb8-7799-4d95-bcc6-08df971a78a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a13fbdb8-7799-4d95-bcc6-08df971a78a8"}
```
