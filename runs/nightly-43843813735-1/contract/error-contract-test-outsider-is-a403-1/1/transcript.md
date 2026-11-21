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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-1cc8946f-b0b3-4796-85b2-d899cf78069d` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-51e88f90-5326-4702-a5c5-01084d294877` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-545acf06-5cfb-4b41-8a77-83501cbdb2d8` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-fd17c751-e13b-430d-b122-b911f9953af9` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-b8219526-4ede-49b0-8f41-e6bd7a2cb8fc` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-2388ca45-7afc-4d75-9884-b53465185f40` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 21 | `qa-701f656a-60e1-4a3b-8fe8-294dca26f122` |
| 8 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-23a89bb0-f220-4bba-a3a7-8f3ef9da59f7` |
| 9 | `POST /v1/auth/token` | 401 | 43 | `qa-9696061e-bb3f-47c5-906d-8c675fc8e7f1` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-965c9c5d-1009-4907-8416-c13044092f1b` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-0b4b14a1-e2e8-43e5-b7ba-b8cf53204d10` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-eacd6dd4-54a4-410d-86a2-6963a236be9b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-727d5fde-e7f2-40c6-a214-a0d1e240639a` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-98a740cb-22a0-4c08-9df7-2eeaa05a33da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1cc8946f-b0b3-4796-85b2-d899cf78069d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cc8946f-b0b3-4796-85b2-d899cf78069d
Content-Type: application/json

--- request body ---
{"handle":"qa-18490b0ee253","displayName":"QA 18490b0ee253","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cc8946f-b0b3-4796-85b2-d899cf78069d
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
Location: /v1/accounts/qa-18490b0ee253
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc907a8b-9aa8-4949-991a-933b990acfe3","handle":"qa-18490b0ee253","displayName":"QA 18490b0ee253","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.094070203Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51e88f90-5326-4702-a5c5-01084d294877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e88f90-5326-4702-a5c5-01084d294877
Content-Type: application/json

--- request body ---
{"handle":"qa-09e3638630e9","displayName":"QA 09e3638630e9","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-51e88f90-5326-4702-a5c5-01084d294877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-09e3638630e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe94eb23-c642-4df0-8b49-32e08b42c57e","handle":"qa-09e3638630e9","displayName":"QA 09e3638630e9","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.145634736Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-545acf06-5cfb-4b41-8a77-83501cbdb2d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-545acf06-5cfb-4b41-8a77-83501cbdb2d8
Content-Type: application/json

--- request body ---
{"handle":"qa-2f8b8b8b796e","displayName":"QA 2f8b8b8b796e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-545acf06-5cfb-4b41-8a77-83501cbdb2d8
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
Location: /v1/accounts/qa-2f8b8b8b796e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e283896-ec5e-4477-9329-4a8ef9b69e41","handle":"qa-2f8b8b8b796e","displayName":"QA 2f8b8b8b796e","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.181019751Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-fd17c751-e13b-430d-b122-b911f9953af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd17c751-e13b-430d-b122-b911f9953af9
Content-Type: application/json

--- request body ---
{"handle":"qa-18490b0ee253","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd17c751-e13b-430d-b122-b911f9953af9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc907a8b-9aa8-4949-991a-933b990acfe3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b8219526-4ede-49b0-8f41-e6bd7a2cb8fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8219526-4ede-49b0-8f41-e6bd7a2cb8fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-09e3638630e9","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8219526-4ede-49b0-8f41-e6bd7a2cb8fc
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
Location: /v1/conversations/cnv_4de5e0f1-2d5a-4b50-8fcb-63a61be1e0d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4de5e0f1-2d5a-4b50-8fcb-63a61be1e0d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-18490b0ee253","qa-09e3638630e9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.235783564Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2388ca45-7afc-4d75-9884-b53465185f40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2388ca45-7afc-4d75-9884-b53465185f40
Content-Type: application/json

--- request body ---
{"handle":"qa-2f8b8b8b796e","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2388ca45-7afc-4d75-9884-b53465185f40
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e283896-ec5e-4477-9329-4a8ef9b69e41"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4de5e0f1-2d5a-4b50-8fcb-63a61be1e0d2/messages
correlation: qa-701f656a-60e1-4a3b-8fe8-294dca26f122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-701f656a-60e1-4a3b-8fe8-294dca26f122
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-701f656a-60e1-4a3b-8fe8-294dca26f122
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4de5e0f1-2d5a-4b50-8fcb-63a61be1e0d2/messages","correlationId":"qa-701f656a-60e1-4a3b-8fe8-294dca26f122"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23a89bb0-f220-4bba-a3a7-8f3ef9da59f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a89bb0-f220-4bba-a3a7-8f3ef9da59f7
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23a89bb0-f220-4bba-a3a7-8f3ef9da59f7
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
correlation: qa-9696061e-bb3f-47c5-906d-8c675fc8e7f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9696061e-bb3f-47c5-906d-8c675fc8e7f1
Content-Type: application/json

--- request body ---
{"handle":"qa-2f8b8b8b796e","password":"****"}

--- response: 401 in 43 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9696061e-bb3f-47c5-906d-8c675fc8e7f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9696061e-bb3f-47c5-906d-8c675fc8e7f1"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-965c9c5d-1009-4907-8416-c13044092f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-965c9c5d-1009-4907-8416-c13044092f1b
Content-Type: application/json

--- request body ---
{"handle":"qa-09e3638630e9","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-965c9c5d-1009-4907-8416-c13044092f1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe94eb23-c642-4df0-8b49-32e08b42c57e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b4b14a1-e2e8-43e5-b7ba-b8cf53204d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b4b14a1-e2e8-43e5-b7ba-b8cf53204d10
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b4b14a1-e2e8-43e5-b7ba-b8cf53204d10
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
correlation: qa-eacd6dd4-54a4-410d-86a2-6963a236be9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eacd6dd4-54a4-410d-86a2-6963a236be9b
Content-Type: application/json

--- request body ---
{"handle":"qa-09e3638630e9","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eacd6dd4-54a4-410d-86a2-6963a236be9b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eacd6dd4-54a4-410d-86a2-6963a236be9b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-727d5fde-e7f2-40c6-a214-a0d1e240639a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-727d5fde-e7f2-40c6-a214-a0d1e240639a
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-727d5fde-e7f2-40c6-a214-a0d1e240639a
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
correlation: qa-98a740cb-22a0-4c08-9df7-2eeaa05a33da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a740cb-22a0-4c08-9df7-2eeaa05a33da
Content-Type: application/json

--- request body ---
{"handle":"qa-18490b0ee253","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98a740cb-22a0-4c08-9df7-2eeaa05a33da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98a740cb-22a0-4c08-9df7-2eeaa05a33da"}
```
