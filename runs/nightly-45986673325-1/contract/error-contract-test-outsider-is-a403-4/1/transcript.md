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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-f8e16eec-c6c3-476c-937b-bbab3a26c7bd` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-aa925d43-9b27-422d-b823-27a8f41c8ace` |
| 3 | `POST /v1/accounts` | 201 | 43 | `qa-ed7e082f-07ed-4c0f-8325-18b183eb986c` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-5266e3cb-946f-43ea-b29a-ca041722feee` |
| 5 | `POST /v1/conversations` | 201 | 75 | `qa-dbe8b4e4-0d41-45e9-ab48-dd84f2c91bd7` |
| 6 | `POST /v1/auth/token` | 200 | 69 | `qa-7a105cc8-5a73-42d7-9c37-e925f9db07ca` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 19 | `qa-67a99eb7-255c-426e-a91a-9157e27ab92d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-81f329c1-233f-4557-a851-ac12e2f6cd48` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-88a57397-619a-4392-958d-ca59b9944a50` |
| 10 | `POST /v1/auth/token` | 200 | 30 | `qa-4c026c26-c932-4c9e-8adf-852147a976e7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-a0f259a8-6df7-483c-869b-c6b7ee4e1006` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-f4d30075-9d18-4902-8a56-c18185be809a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8611b52b-1033-41e4-b11e-9c59a47ba011` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-05c7c4ee-6bda-4993-a306-662dcce41a35` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f8e16eec-c6c3-476c-937b-bbab3a26c7bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e16eec-c6c3-476c-937b-bbab3a26c7bd
Content-Type: application/json

--- request body ---
{"handle":"qa-e00b3b869683","displayName":"QA e00b3b869683","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8e16eec-c6c3-476c-937b-bbab3a26c7bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-e00b3b869683
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66bd1086-99da-41c2-9530-2b9aa485c930","handle":"qa-e00b3b869683","displayName":"QA e00b3b869683","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.693253905Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aa925d43-9b27-422d-b823-27a8f41c8ace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa925d43-9b27-422d-b823-27a8f41c8ace
Content-Type: application/json

--- request body ---
{"handle":"qa-2f26e239d3e4","displayName":"QA 2f26e239d3e4","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa925d43-9b27-422d-b823-27a8f41c8ace
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f26e239d3e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d64f7dfc-1c44-4587-a702-6fed2c3da1f9","handle":"qa-2f26e239d3e4","displayName":"QA 2f26e239d3e4","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.764156774Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ed7e082f-07ed-4c0f-8325-18b183eb986c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed7e082f-07ed-4c0f-8325-18b183eb986c
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc710f2a861","displayName":"QA 6dc710f2a861","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed7e082f-07ed-4c0f-8325-18b183eb986c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Location: /v1/accounts/qa-6dc710f2a861
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76742481-01c3-4299-a0bc-6f9c3f17208c","handle":"qa-6dc710f2a861","displayName":"QA 6dc710f2a861","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.808187684Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5266e3cb-946f-43ea-b29a-ca041722feee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5266e3cb-946f-43ea-b29a-ca041722feee
Content-Type: application/json

--- request body ---
{"handle":"qa-e00b3b869683","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5266e3cb-946f-43ea-b29a-ca041722feee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66bd1086-99da-41c2-9530-2b9aa485c930"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-dbe8b4e4-0d41-45e9-ab48-dd84f2c91bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe8b4e4-0d41-45e9-ab48-dd84f2c91bd7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2f26e239d3e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 75 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbe8b4e4-0d41-45e9-ab48-dd84f2c91bd7
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
Location: /v1/conversations/cnv_c70ff718-59a3-4111-8c2f-3a004b9c8c19
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c70ff718-59a3-4111-8c2f-3a004b9c8c19","subject":"Error contract","status":"open","region":"eu","participants":["qa-e00b3b869683","qa-2f26e239d3e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.991584181Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7a105cc8-5a73-42d7-9c37-e925f9db07ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a105cc8-5a73-42d7-9c37-e925f9db07ca
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc710f2a861","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a105cc8-5a73-42d7-9c37-e925f9db07ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76742481-01c3-4299-a0bc-6f9c3f17208c"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c70ff718-59a3-4111-8c2f-3a004b9c8c19/close
correlation: qa-67a99eb7-255c-426e-a91a-9157e27ab92d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a99eb7-255c-426e-a91a-9157e27ab92d
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67a99eb7-255c-426e-a91a-9157e27ab92d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c70ff718-59a3-4111-8c2f-3a004b9c8c19/close","correlationId":"qa-67a99eb7-255c-426e-a91a-9157e27ab92d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81f329c1-233f-4557-a851-ac12e2f6cd48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81f329c1-233f-4557-a851-ac12e2f6cd48
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81f329c1-233f-4557-a851-ac12e2f6cd48
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
correlation: qa-88a57397-619a-4392-958d-ca59b9944a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88a57397-619a-4392-958d-ca59b9944a50
Content-Type: application/json

--- request body ---
{"handle":"qa-6dc710f2a861","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88a57397-619a-4392-958d-ca59b9944a50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88a57397-619a-4392-958d-ca59b9944a50"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4c026c26-c932-4c9e-8adf-852147a976e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c026c26-c932-4c9e-8adf-852147a976e7
Content-Type: application/json

--- request body ---
{"handle":"qa-2f26e239d3e4","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c026c26-c932-4c9e-8adf-852147a976e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d64f7dfc-1c44-4587-a702-6fed2c3da1f9"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0f259a8-6df7-483c-869b-c6b7ee4e1006

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0f259a8-6df7-483c-869b-c6b7ee4e1006
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0f259a8-6df7-483c-869b-c6b7ee4e1006
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
correlation: qa-f4d30075-9d18-4902-8a56-c18185be809a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4d30075-9d18-4902-8a56-c18185be809a
Content-Type: application/json

--- request body ---
{"handle":"qa-2f26e239d3e4","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4d30075-9d18-4902-8a56-c18185be809a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4d30075-9d18-4902-8a56-c18185be809a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8611b52b-1033-41e4-b11e-9c59a47ba011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8611b52b-1033-41e4-b11e-9c59a47ba011
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8611b52b-1033-41e4-b11e-9c59a47ba011
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
correlation: qa-05c7c4ee-6bda-4993-a306-662dcce41a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05c7c4ee-6bda-4993-a306-662dcce41a35
Content-Type: application/json

--- request body ---
{"handle":"qa-e00b3b869683","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05c7c4ee-6bda-4993-a306-662dcce41a35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05c7c4ee-6bda-4993-a306-662dcce41a35"}
```
