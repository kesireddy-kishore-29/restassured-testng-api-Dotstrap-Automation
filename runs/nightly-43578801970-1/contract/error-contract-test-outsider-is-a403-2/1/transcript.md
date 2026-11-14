# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-41e00b16-549b-4fd4-9276-74bfd45dfdba` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-77faa746-8b3b-402a-836e-0c45304f2739` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-19414594-ad38-420e-95fe-3bd0e366d803` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-c5c76bcf-b636-4b3e-868c-a4a78a03cf66` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-5bb00335-8f98-4029-8bf9-2cc9fbf45336` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-2873b3ee-102f-40c6-9229-09a8e5a6ddeb` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-7461473e-6cd7-4027-960d-5c63aaa2700f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-837564f7-c23c-4d73-9048-b5c3ac74915d` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-e0be97f1-7536-4129-b94c-8566dadc7791` |
| 10 | `POST /v1/auth/token` | 200 | 40 | `qa-bea48cc0-4287-4141-b968-f2cab730a7fe` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e26749c4-d41e-4449-82c5-5dc0870e8830` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-3ac1ce71-5cbd-42ec-b300-3843701ce40c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-82ee7cce-6d8c-4ddd-9484-55765a56c05b` |
| 14 | `POST /v1/auth/token` | 401 | 24 | `qa-cfac653c-c75f-4a87-b58d-dca47b89e3a7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41e00b16-549b-4fd4-9276-74bfd45dfdba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41e00b16-549b-4fd4-9276-74bfd45dfdba
Content-Type: application/json

--- request body ---
{"handle":"qa-c2c81913dd98","displayName":"QA c2c81913dd98","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-41e00b16-549b-4fd4-9276-74bfd45dfdba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-c2c81913dd98
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be4a135d-0d25-42a8-be1c-158173e107d8","handle":"qa-c2c81913dd98","displayName":"QA c2c81913dd98","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.232615230Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-77faa746-8b3b-402a-836e-0c45304f2739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77faa746-8b3b-402a-836e-0c45304f2739
Content-Type: application/json

--- request body ---
{"handle":"qa-5540625ac80b","displayName":"QA 5540625ac80b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-77faa746-8b3b-402a-836e-0c45304f2739
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-5540625ac80b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12a02779-a8cd-455a-95e5-15f4276ab585","handle":"qa-5540625ac80b","displayName":"QA 5540625ac80b","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.274013781Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-19414594-ad38-420e-95fe-3bd0e366d803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19414594-ad38-420e-95fe-3bd0e366d803
Content-Type: application/json

--- request body ---
{"handle":"qa-5cca90c7ba07","displayName":"QA 5cca90c7ba07","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-19414594-ad38-420e-95fe-3bd0e366d803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-5cca90c7ba07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e137648-8f6a-402f-b4be-c4e66d8d46ec","handle":"qa-5cca90c7ba07","displayName":"QA 5cca90c7ba07","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.307452976Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c5c76bcf-b636-4b3e-868c-a4a78a03cf66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c76bcf-b636-4b3e-868c-a4a78a03cf66
Content-Type: application/json

--- request body ---
{"handle":"qa-c2c81913dd98","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5c76bcf-b636-4b3e-868c-a4a78a03cf66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be4a135d-0d25-42a8-be1c-158173e107d8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5bb00335-8f98-4029-8bf9-2cc9fbf45336

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bb00335-8f98-4029-8bf9-2cc9fbf45336
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5540625ac80b","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bb00335-8f98-4029-8bf9-2cc9fbf45336
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
Location: /v1/conversations/cnv_862a6801-381d-4ea6-bf55-60f6dbcdbad8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_862a6801-381d-4ea6-bf55-60f6dbcdbad8","subject":"Error contract","status":"open","region":"eu","participants":["qa-c2c81913dd98","qa-5540625ac80b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.377116743Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2873b3ee-102f-40c6-9229-09a8e5a6ddeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2873b3ee-102f-40c6-9229-09a8e5a6ddeb
Content-Type: application/json

--- request body ---
{"handle":"qa-5cca90c7ba07","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2873b3ee-102f-40c6-9229-09a8e5a6ddeb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e137648-8f6a-402f-b4be-c4e66d8d46ec"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_862a6801-381d-4ea6-bf55-60f6dbcdbad8/messages
correlation: qa-7461473e-6cd7-4027-960d-5c63aaa2700f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7461473e-6cd7-4027-960d-5c63aaa2700f
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7461473e-6cd7-4027-960d-5c63aaa2700f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_862a6801-381d-4ea6-bf55-60f6dbcdbad8/messages","correlationId":"qa-7461473e-6cd7-4027-960d-5c63aaa2700f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-837564f7-c23c-4d73-9048-b5c3ac74915d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-837564f7-c23c-4d73-9048-b5c3ac74915d
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-837564f7-c23c-4d73-9048-b5c3ac74915d
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
correlation: qa-e0be97f1-7536-4129-b94c-8566dadc7791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0be97f1-7536-4129-b94c-8566dadc7791
Content-Type: application/json

--- request body ---
{"handle":"qa-5cca90c7ba07","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0be97f1-7536-4129-b94c-8566dadc7791
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0be97f1-7536-4129-b94c-8566dadc7791"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bea48cc0-4287-4141-b968-f2cab730a7fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea48cc0-4287-4141-b968-f2cab730a7fe
Content-Type: application/json

--- request body ---
{"handle":"qa-5540625ac80b","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea48cc0-4287-4141-b968-f2cab730a7fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12a02779-a8cd-455a-95e5-15f4276ab585"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e26749c4-d41e-4449-82c5-5dc0870e8830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e26749c4-d41e-4449-82c5-5dc0870e8830
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e26749c4-d41e-4449-82c5-5dc0870e8830
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
correlation: qa-3ac1ce71-5cbd-42ec-b300-3843701ce40c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ac1ce71-5cbd-42ec-b300-3843701ce40c
Content-Type: application/json

--- request body ---
{"handle":"qa-5540625ac80b","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ac1ce71-5cbd-42ec-b300-3843701ce40c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ac1ce71-5cbd-42ec-b300-3843701ce40c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82ee7cce-6d8c-4ddd-9484-55765a56c05b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ee7cce-6d8c-4ddd-9484-55765a56c05b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82ee7cce-6d8c-4ddd-9484-55765a56c05b
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
correlation: qa-cfac653c-c75f-4a87-b58d-dca47b89e3a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfac653c-c75f-4a87-b58d-dca47b89e3a7
Content-Type: application/json

--- request body ---
{"handle":"qa-c2c81913dd98","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfac653c-c75f-4a87-b58d-dca47b89e3a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cfac653c-c75f-4a87-b58d-dca47b89e3a7"}
```
