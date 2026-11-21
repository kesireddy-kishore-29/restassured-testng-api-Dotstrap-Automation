# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-7400b9e7-defc-4c38-9620-393153ba8877` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-4b213b42-288e-4d01-8acf-a68ed818af01` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-16d0ecd9-5775-48a1-8158-009c4e24f21f` |
| 4 | `POST /v1/auth/token` | 200 | 29 | `qa-c80e05b0-283f-41eb-a8d8-3b51a573ba65` |
| 5 | `POST /v1/conversations` | 201 | 24 | `qa-970a2802-2102-4110-898f-4bd07b139f30` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-0a99f683-8fbd-4cc5-a785-116090163395` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 38 | `qa-7351dff1-e329-4d1a-8326-394b9985a696` |
| 8 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-650b67f7-8ade-47e0-843c-b118937798e4` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-01bfe0b8-f76b-4532-8d64-4752bd6bc850` |
| 10 | `POST /v1/auth/token` | 200 | 18 | `qa-7f239b1b-9f9d-4e9f-9562-a9908232d612` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1c93bf24-1569-4d0c-8319-22dd7a3d5f50` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-44479d2d-f5be-4bdb-b69f-0fb83a38401a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-3bfde75b-44df-43d4-9e45-e73192c232c1` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-77792dec-574f-4671-80f3-8adceff5772f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7400b9e7-defc-4c38-9620-393153ba8877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7400b9e7-defc-4c38-9620-393153ba8877
Content-Type: application/json

--- request body ---
{"handle":"qa-7260afc1064e","displayName":"QA 7260afc1064e","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7400b9e7-defc-4c38-9620-393153ba8877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-7260afc1064e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d5c8e8c-ea8c-4f67-b480-151ec9d2693a","handle":"qa-7260afc1064e","displayName":"QA 7260afc1064e","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.208640734Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b213b42-288e-4d01-8acf-a68ed818af01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b213b42-288e-4d01-8acf-a68ed818af01
Content-Type: application/json

--- request body ---
{"handle":"qa-66506ed19e7b","displayName":"QA 66506ed19e7b","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b213b42-288e-4d01-8acf-a68ed818af01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-66506ed19e7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f0f0789d-1830-49ed-bc46-0af1b7de1f31","handle":"qa-66506ed19e7b","displayName":"QA 66506ed19e7b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.260931363Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-16d0ecd9-5775-48a1-8158-009c4e24f21f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d0ecd9-5775-48a1-8158-009c4e24f21f
Content-Type: application/json

--- request body ---
{"handle":"qa-7bedc5ddbeb5","displayName":"QA 7bedc5ddbeb5","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d0ecd9-5775-48a1-8158-009c4e24f21f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Location: /v1/accounts/qa-7bedc5ddbeb5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75d56069-2551-407f-8519-db0e04c0faac","handle":"qa-7bedc5ddbeb5","displayName":"QA 7bedc5ddbeb5","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.332157131Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c80e05b0-283f-41eb-a8d8-3b51a573ba65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c80e05b0-283f-41eb-a8d8-3b51a573ba65
Content-Type: application/json

--- request body ---
{"handle":"qa-7260afc1064e","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c80e05b0-283f-41eb-a8d8-3b51a573ba65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d5c8e8c-ea8c-4f67-b480-151ec9d2693a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-970a2802-2102-4110-898f-4bd07b139f30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-970a2802-2102-4110-898f-4bd07b139f30
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-66506ed19e7b","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-970a2802-2102-4110-898f-4bd07b139f30
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
Location: /v1/conversations/cnv_0498ba81-14e9-40d0-8f9c-6e9fe0df2ba5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0498ba81-14e9-40d0-8f9c-6e9fe0df2ba5","subject":"Error contract","status":"open","region":"eu","participants":["qa-7260afc1064e","qa-66506ed19e7b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.403317404Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a99f683-8fbd-4cc5-a785-116090163395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a99f683-8fbd-4cc5-a785-116090163395
Content-Type: application/json

--- request body ---
{"handle":"qa-7bedc5ddbeb5","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a99f683-8fbd-4cc5-a785-116090163395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75d56069-2551-407f-8519-db0e04c0faac"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0498ba81-14e9-40d0-8f9c-6e9fe0df2ba5/close
correlation: qa-7351dff1-e329-4d1a-8326-394b9985a696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7351dff1-e329-4d1a-8326-394b9985a696
Content-Type: application/json

--- response: 403 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7351dff1-e329-4d1a-8326-394b9985a696
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0498ba81-14e9-40d0-8f9c-6e9fe0df2ba5/close","correlationId":"qa-7351dff1-e329-4d1a-8326-394b9985a696"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-650b67f7-8ade-47e0-843c-b118937798e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-650b67f7-8ade-47e0-843c-b118937798e4
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-650b67f7-8ade-47e0-843c-b118937798e4
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
correlation: qa-01bfe0b8-f76b-4532-8d64-4752bd6bc850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01bfe0b8-f76b-4532-8d64-4752bd6bc850
Content-Type: application/json

--- request body ---
{"handle":"qa-7bedc5ddbeb5","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01bfe0b8-f76b-4532-8d64-4752bd6bc850
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01bfe0b8-f76b-4532-8d64-4752bd6bc850"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7f239b1b-9f9d-4e9f-9562-a9908232d612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f239b1b-9f9d-4e9f-9562-a9908232d612
Content-Type: application/json

--- request body ---
{"handle":"qa-66506ed19e7b","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f239b1b-9f9d-4e9f-9562-a9908232d612
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f0f0789d-1830-49ed-bc46-0af1b7de1f31"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c93bf24-1569-4d0c-8319-22dd7a3d5f50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c93bf24-1569-4d0c-8319-22dd7a3d5f50
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c93bf24-1569-4d0c-8319-22dd7a3d5f50
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
correlation: qa-44479d2d-f5be-4bdb-b69f-0fb83a38401a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44479d2d-f5be-4bdb-b69f-0fb83a38401a
Content-Type: application/json

--- request body ---
{"handle":"qa-66506ed19e7b","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44479d2d-f5be-4bdb-b69f-0fb83a38401a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44479d2d-f5be-4bdb-b69f-0fb83a38401a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bfde75b-44df-43d4-9e45-e73192c232c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bfde75b-44df-43d4-9e45-e73192c232c1
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bfde75b-44df-43d4-9e45-e73192c232c1
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
correlation: qa-77792dec-574f-4671-80f3-8adceff5772f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77792dec-574f-4671-80f3-8adceff5772f
Content-Type: application/json

--- request body ---
{"handle":"qa-7260afc1064e","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77792dec-574f-4671-80f3-8adceff5772f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77792dec-574f-4671-80f3-8adceff5772f"}
```
