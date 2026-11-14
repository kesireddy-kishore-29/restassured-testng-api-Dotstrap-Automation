# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-47e6f300-6819-4f4c-8fa4-6d92210d47d5` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-1fc93bbf-d3d0-4715-8f87-1931ccfd2600` |
| 3 | `POST /v1/accounts` | 201 | 26 | `qa-dcf8d09d-4923-4c86-92f7-f73111d4f95e` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-8b58aa77-e00f-4c8c-aea1-708e74b99a57` |
| 5 | `POST /v1/conversations` | 201 | 35 | `qa-3fa283fb-03e5-413e-b281-12f34ba5168d` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-c710caa6-407b-4c73-b29a-ae0c5fa5ec00` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 30 | `qa-95cd2a49-9b9a-477e-8c25-3d4ba898e9c4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-5d4c34c2-a283-42e2-97d5-34ed80ae24d1` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-1dd8f7ab-170b-4126-8205-46cdf4eafc57` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-9219fbd0-1ff7-4a16-8eb3-899f5dddac12` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-6fa7296a-36d7-439b-a9bb-9b5c4b7051a0` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-5ae0a7b3-6725-45e2-bd69-a5ead2768866` |
| 13 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-1dbac549-b7fc-4d89-b212-c2160376e455` |
| 14 | `POST /v1/auth/token` | 401 | 25 | `qa-fddaadef-38f5-482d-abf8-cde5cd5a53ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47e6f300-6819-4f4c-8fa4-6d92210d47d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e6f300-6819-4f4c-8fa4-6d92210d47d5
Content-Type: application/json

--- request body ---
{"handle":"qa-591e669d4d41","displayName":"QA 591e669d4d41","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-47e6f300-6819-4f4c-8fa4-6d92210d47d5
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
Location: /v1/accounts/qa-591e669d4d41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2b244be7-8103-473f-8322-8ae400cb02af","handle":"qa-591e669d4d41","displayName":"QA 591e669d4d41","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.073071634Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1fc93bbf-d3d0-4715-8f87-1931ccfd2600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fc93bbf-d3d0-4715-8f87-1931ccfd2600
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbfc48fa8e4","displayName":"QA 6dbfc48fa8e4","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fc93bbf-d3d0-4715-8f87-1931ccfd2600
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-6dbfc48fa8e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7569e415-c74b-4b0e-8df9-3f23f567bca9","handle":"qa-6dbfc48fa8e4","displayName":"QA 6dbfc48fa8e4","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.115601859Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-dcf8d09d-4923-4c86-92f7-f73111d4f95e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf8d09d-4923-4c86-92f7-f73111d4f95e
Content-Type: application/json

--- request body ---
{"handle":"qa-698829230aaf","displayName":"QA 698829230aaf","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcf8d09d-4923-4c86-92f7-f73111d4f95e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-698829230aaf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_704c7c19-dd2b-44e5-9aec-05e9c047c37d","handle":"qa-698829230aaf","displayName":"QA 698829230aaf","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.153082426Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8b58aa77-e00f-4c8c-aea1-708e74b99a57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b58aa77-e00f-4c8c-aea1-708e74b99a57
Content-Type: application/json

--- request body ---
{"handle":"qa-591e669d4d41","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b58aa77-e00f-4c8c-aea1-708e74b99a57
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b244be7-8103-473f-8322-8ae400cb02af"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3fa283fb-03e5-413e-b281-12f34ba5168d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fa283fb-03e5-413e-b281-12f34ba5168d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6dbfc48fa8e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fa283fb-03e5-413e-b281-12f34ba5168d
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
Location: /v1/conversations/cnv_f4b91426-acbb-445c-bc4c-7cc19cecd98c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f4b91426-acbb-445c-bc4c-7cc19cecd98c","subject":"Error contract","status":"open","region":"eu","participants":["qa-591e669d4d41","qa-6dbfc48fa8e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.235442273Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c710caa6-407b-4c73-b29a-ae0c5fa5ec00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c710caa6-407b-4c73-b29a-ae0c5fa5ec00
Content-Type: application/json

--- request body ---
{"handle":"qa-698829230aaf","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c710caa6-407b-4c73-b29a-ae0c5fa5ec00
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_704c7c19-dd2b-44e5-9aec-05e9c047c37d"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f4b91426-acbb-445c-bc4c-7cc19cecd98c/read
correlation: qa-95cd2a49-9b9a-477e-8c25-3d4ba898e9c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95cd2a49-9b9a-477e-8c25-3d4ba898e9c4
Content-Type: application/json

--- response: 403 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95cd2a49-9b9a-477e-8c25-3d4ba898e9c4
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f4b91426-acbb-445c-bc4c-7cc19cecd98c/read","correlationId":"qa-95cd2a49-9b9a-477e-8c25-3d4ba898e9c4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d4c34c2-a283-42e2-97d5-34ed80ae24d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d4c34c2-a283-42e2-97d5-34ed80ae24d1
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d4c34c2-a283-42e2-97d5-34ed80ae24d1
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
correlation: qa-1dd8f7ab-170b-4126-8205-46cdf4eafc57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dd8f7ab-170b-4126-8205-46cdf4eafc57
Content-Type: application/json

--- request body ---
{"handle":"qa-698829230aaf","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1dd8f7ab-170b-4126-8205-46cdf4eafc57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1dd8f7ab-170b-4126-8205-46cdf4eafc57"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9219fbd0-1ff7-4a16-8eb3-899f5dddac12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9219fbd0-1ff7-4a16-8eb3-899f5dddac12
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbfc48fa8e4","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9219fbd0-1ff7-4a16-8eb3-899f5dddac12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7569e415-c74b-4b0e-8df9-3f23f567bca9"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fa7296a-36d7-439b-a9bb-9b5c4b7051a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fa7296a-36d7-439b-a9bb-9b5c4b7051a0
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fa7296a-36d7-439b-a9bb-9b5c4b7051a0
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
correlation: qa-5ae0a7b3-6725-45e2-bd69-a5ead2768866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ae0a7b3-6725-45e2-bd69-a5ead2768866
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbfc48fa8e4","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ae0a7b3-6725-45e2-bd69-a5ead2768866
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ae0a7b3-6725-45e2-bd69-a5ead2768866"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1dbac549-b7fc-4d89-b212-c2160376e455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dbac549-b7fc-4d89-b212-c2160376e455
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1dbac549-b7fc-4d89-b212-c2160376e455
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
correlation: qa-fddaadef-38f5-482d-abf8-cde5cd5a53ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fddaadef-38f5-482d-abf8-cde5cd5a53ca
Content-Type: application/json

--- request body ---
{"handle":"qa-591e669d4d41","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fddaadef-38f5-482d-abf8-cde5cd5a53ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fddaadef-38f5-482d-abf8-cde5cd5a53ca"}
```
