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
| 1 | `POST /v1/accounts` | 201 | 433 | `qa-0868719f-c91b-4b9a-8ca4-262957faea3f` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-51d73960-e04e-4942-9a48-65da046fbeff` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-f727433c-4757-4e50-b8bf-a32f7fb7e1d0` |
| 4 | `POST /v1/auth/token` | 200 | 42 | `qa-11f7200d-e76c-4617-aa6c-08e7240dad11` |
| 5 | `POST /v1/conversations` | 201 | 63 | `qa-24819829-55a7-48ff-9a05-81daf19bec57` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-24ce411e-2d1f-4e2a-9ffc-32b8c21bf95e` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 20 | `qa-01753f5d-bc78-4b97-a808-7960e0a8a795` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-27dbdfa6-0f76-4c71-8092-657fda643f3d` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-f43c68ec-5a76-4ca2-967f-0fcc7c10ab15` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-8686d70e-b869-4d89-aecb-2931d7dd1567` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-eb5c4884-1cf2-4eeb-ae31-b0297072da0e` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-983477bb-ae53-441f-96e8-52705701a62b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 56 | `qa-9588729b-7779-4f54-bfd0-f36ce39731b0` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-5415c912-fdd3-49d2-9b34-014d988fa121` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0868719f-c91b-4b9a-8ca4-262957faea3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0868719f-c91b-4b9a-8ca4-262957faea3f
Content-Type: application/json

--- request body ---
{"handle":"qa-e531b0cf6665","displayName":"QA e531b0cf6665","password":"****","region":"eu"}

--- response: 201 in 433 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0868719f-c91b-4b9a-8ca4-262957faea3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-e531b0cf6665
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a5b4966b-4628-4613-a612-6adb08c1d022","handle":"qa-e531b0cf6665","displayName":"QA e531b0cf6665","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.720611106Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51d73960-e04e-4942-9a48-65da046fbeff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51d73960-e04e-4942-9a48-65da046fbeff
Content-Type: application/json

--- request body ---
{"handle":"qa-1c56791d1337","displayName":"QA 1c56791d1337","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-51d73960-e04e-4942-9a48-65da046fbeff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-1c56791d1337
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b024710a-ccac-4482-881b-75341647d774","handle":"qa-1c56791d1337","displayName":"QA 1c56791d1337","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.976285166Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f727433c-4757-4e50-b8bf-a32f7fb7e1d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f727433c-4757-4e50-b8bf-a32f7fb7e1d0
Content-Type: application/json

--- request body ---
{"handle":"qa-0daba7a0595c","displayName":"QA 0daba7a0595c","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f727433c-4757-4e50-b8bf-a32f7fb7e1d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-0daba7a0595c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c027773-e539-4045-bd1d-8c1d2d7e8a6c","handle":"qa-0daba7a0595c","displayName":"QA 0daba7a0595c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:35.024066144Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-11f7200d-e76c-4617-aa6c-08e7240dad11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11f7200d-e76c-4617-aa6c-08e7240dad11
Content-Type: application/json

--- request body ---
{"handle":"qa-e531b0cf6665","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-11f7200d-e76c-4617-aa6c-08e7240dad11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a5b4966b-4628-4613-a612-6adb08c1d022"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-24819829-55a7-48ff-9a05-81daf19bec57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24819829-55a7-48ff-9a05-81daf19bec57
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c56791d1337","subject":"Error contract","message":"Hi"}

--- response: 201 in 63 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-24819829-55a7-48ff-9a05-81daf19bec57
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
Location: /v1/conversations/cnv_cf2f14cc-5a26-464b-8f76-772b67f82add
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cf2f14cc-5a26-464b-8f76-772b67f82add","subject":"Error contract","status":"open","region":"eu","participants":["qa-e531b0cf6665","qa-1c56791d1337"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.192861779Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-24ce411e-2d1f-4e2a-9ffc-32b8c21bf95e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ce411e-2d1f-4e2a-9ffc-32b8c21bf95e
Content-Type: application/json

--- request body ---
{"handle":"qa-0daba7a0595c","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-24ce411e-2d1f-4e2a-9ffc-32b8c21bf95e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c027773-e539-4045-bd1d-8c1d2d7e8a6c"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cf2f14cc-5a26-464b-8f76-772b67f82add/messages
correlation: qa-01753f5d-bc78-4b97-a808-7960e0a8a795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01753f5d-bc78-4b97-a808-7960e0a8a795
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01753f5d-bc78-4b97-a808-7960e0a8a795
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_cf2f14cc-5a26-464b-8f76-772b67f82add/messages","correlationId":"qa-01753f5d-bc78-4b97-a808-7960e0a8a795"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27dbdfa6-0f76-4c71-8092-657fda643f3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27dbdfa6-0f76-4c71-8092-657fda643f3d
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27dbdfa6-0f76-4c71-8092-657fda643f3d
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
correlation: qa-f43c68ec-5a76-4ca2-967f-0fcc7c10ab15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f43c68ec-5a76-4ca2-967f-0fcc7c10ab15
Content-Type: application/json

--- request body ---
{"handle":"qa-0daba7a0595c","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f43c68ec-5a76-4ca2-967f-0fcc7c10ab15
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f43c68ec-5a76-4ca2-967f-0fcc7c10ab15"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8686d70e-b869-4d89-aecb-2931d7dd1567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8686d70e-b869-4d89-aecb-2931d7dd1567
Content-Type: application/json

--- request body ---
{"handle":"qa-1c56791d1337","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8686d70e-b869-4d89-aecb-2931d7dd1567
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b024710a-ccac-4482-881b-75341647d774"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb5c4884-1cf2-4eeb-ae31-b0297072da0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb5c4884-1cf2-4eeb-ae31-b0297072da0e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb5c4884-1cf2-4eeb-ae31-b0297072da0e
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
correlation: qa-983477bb-ae53-441f-96e8-52705701a62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-983477bb-ae53-441f-96e8-52705701a62b
Content-Type: application/json

--- request body ---
{"handle":"qa-1c56791d1337","password":"****"}

--- response: 401 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-983477bb-ae53-441f-96e8-52705701a62b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-983477bb-ae53-441f-96e8-52705701a62b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9588729b-7779-4f54-bfd0-f36ce39731b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9588729b-7779-4f54-bfd0-f36ce39731b0
Content-Type: application/json

--- response: 204 in 56 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9588729b-7779-4f54-bfd0-f36ce39731b0
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
correlation: qa-5415c912-fdd3-49d2-9b34-014d988fa121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5415c912-fdd3-49d2-9b34-014d988fa121
Content-Type: application/json

--- request body ---
{"handle":"qa-e531b0cf6665","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5415c912-fdd3-49d2-9b34-014d988fa121
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5415c912-fdd3-49d2-9b34-014d988fa121"}
```
