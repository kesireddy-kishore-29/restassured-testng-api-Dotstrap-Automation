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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-aa411ede-4a8f-4e2f-98f2-e5e5b7ac8d8a` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-a45a2f58-5d67-4e48-a270-c229422b33a6` |
| 3 | `POST /v1/accounts` | 201 | 40 | `qa-aec68c08-cee3-41c2-a8e0-96e08216fac7` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-ca6aaaf7-b5a2-47d6-ab2f-49208fbd9a73` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-e5d80139-f805-49ac-ba01-bcdee2cd67de` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-c15f3aa5-86da-4efc-9211-fa233bac5dd1` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 17 | `qa-2a9c1ba2-46cd-4356-b1b0-9b952a06d04a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-d0e3bfb0-2c79-4bfa-8803-24e5eff1881f` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-489efd6c-0470-4935-978d-ef8b2a74191b` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-343ff94c-e3a3-4e83-a0cb-24199e43652c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-8933fe6d-6025-4140-b37c-2fc3797e31ef` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-f7ae2df7-5a4c-49b0-9372-e6d07bfd8efc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-327013bb-458a-42b6-8ace-7f04510d2a20` |
| 14 | `POST /v1/auth/token` | 401 | 33 | `qa-2fae2628-c672-4352-89c6-ceec517ed9b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa411ede-4a8f-4e2f-98f2-e5e5b7ac8d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa411ede-4a8f-4e2f-98f2-e5e5b7ac8d8a
Content-Type: application/json

--- request body ---
{"handle":"qa-6cfca07f2d33","displayName":"QA 6cfca07f2d33","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa411ede-4a8f-4e2f-98f2-e5e5b7ac8d8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-6cfca07f2d33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74c3c5c2-3d51-4743-8aeb-a27964d3f047","handle":"qa-6cfca07f2d33","displayName":"QA 6cfca07f2d33","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.456606840Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a45a2f58-5d67-4e48-a270-c229422b33a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a45a2f58-5d67-4e48-a270-c229422b33a6
Content-Type: application/json

--- request body ---
{"handle":"qa-e19d37a56671","displayName":"QA e19d37a56671","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a45a2f58-5d67-4e48-a270-c229422b33a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-e19d37a56671
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2bfaacbf-44ef-401e-9513-9e04475340a3","handle":"qa-e19d37a56671","displayName":"QA e19d37a56671","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.541051725Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-aec68c08-cee3-41c2-a8e0-96e08216fac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aec68c08-cee3-41c2-a8e0-96e08216fac7
Content-Type: application/json

--- request body ---
{"handle":"qa-e2778720fb41","displayName":"QA e2778720fb41","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aec68c08-cee3-41c2-a8e0-96e08216fac7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-e2778720fb41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_419cae0e-8b8c-421d-8ce1-d6845ffa3cfb","handle":"qa-e2778720fb41","displayName":"QA e2778720fb41","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.631956195Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ca6aaaf7-b5a2-47d6-ab2f-49208fbd9a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca6aaaf7-b5a2-47d6-ab2f-49208fbd9a73
Content-Type: application/json

--- request body ---
{"handle":"qa-6cfca07f2d33","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca6aaaf7-b5a2-47d6-ab2f-49208fbd9a73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74c3c5c2-3d51-4743-8aeb-a27964d3f047"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e5d80139-f805-49ac-ba01-bcdee2cd67de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d80139-f805-49ac-ba01-bcdee2cd67de
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e19d37a56671","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5d80139-f805-49ac-ba01-bcdee2cd67de
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
Location: /v1/conversations/cnv_8cbf8a8b-143c-4783-9df7-ff98bdcc19d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8cbf8a8b-143c-4783-9df7-ff98bdcc19d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-6cfca07f2d33","qa-e19d37a56671"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.689834926Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c15f3aa5-86da-4efc-9211-fa233bac5dd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c15f3aa5-86da-4efc-9211-fa233bac5dd1
Content-Type: application/json

--- request body ---
{"handle":"qa-e2778720fb41","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c15f3aa5-86da-4efc-9211-fa233bac5dd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_419cae0e-8b8c-421d-8ce1-d6845ffa3cfb"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8cbf8a8b-143c-4783-9df7-ff98bdcc19d2/messages
correlation: qa-2a9c1ba2-46cd-4356-b1b0-9b952a06d04a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a9c1ba2-46cd-4356-b1b0-9b952a06d04a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a9c1ba2-46cd-4356-b1b0-9b952a06d04a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8cbf8a8b-143c-4783-9df7-ff98bdcc19d2/messages","correlationId":"qa-2a9c1ba2-46cd-4356-b1b0-9b952a06d04a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0e3bfb0-2c79-4bfa-8803-24e5eff1881f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0e3bfb0-2c79-4bfa-8803-24e5eff1881f
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0e3bfb0-2c79-4bfa-8803-24e5eff1881f
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
correlation: qa-489efd6c-0470-4935-978d-ef8b2a74191b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-489efd6c-0470-4935-978d-ef8b2a74191b
Content-Type: application/json

--- request body ---
{"handle":"qa-e2778720fb41","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-489efd6c-0470-4935-978d-ef8b2a74191b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-489efd6c-0470-4935-978d-ef8b2a74191b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-343ff94c-e3a3-4e83-a0cb-24199e43652c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-343ff94c-e3a3-4e83-a0cb-24199e43652c
Content-Type: application/json

--- request body ---
{"handle":"qa-e19d37a56671","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-343ff94c-e3a3-4e83-a0cb-24199e43652c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2bfaacbf-44ef-401e-9513-9e04475340a3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8933fe6d-6025-4140-b37c-2fc3797e31ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8933fe6d-6025-4140-b37c-2fc3797e31ef
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8933fe6d-6025-4140-b37c-2fc3797e31ef
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
correlation: qa-f7ae2df7-5a4c-49b0-9372-e6d07bfd8efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7ae2df7-5a4c-49b0-9372-e6d07bfd8efc
Content-Type: application/json

--- request body ---
{"handle":"qa-e19d37a56671","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7ae2df7-5a4c-49b0-9372-e6d07bfd8efc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7ae2df7-5a4c-49b0-9372-e6d07bfd8efc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-327013bb-458a-42b6-8ace-7f04510d2a20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327013bb-458a-42b6-8ace-7f04510d2a20
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-327013bb-458a-42b6-8ace-7f04510d2a20
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2fae2628-c672-4352-89c6-ceec517ed9b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fae2628-c672-4352-89c6-ceec517ed9b8
Content-Type: application/json

--- request body ---
{"handle":"qa-6cfca07f2d33","password":"****"}

--- response: 401 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fae2628-c672-4352-89c6-ceec517ed9b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fae2628-c672-4352-89c6-ceec517ed9b8"}
```
