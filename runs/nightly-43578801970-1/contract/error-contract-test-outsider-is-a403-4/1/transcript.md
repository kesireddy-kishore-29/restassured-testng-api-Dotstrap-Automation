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
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-379a7d8f-9616-428f-afa4-8dfe8f7fb4cd` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-df1f76ce-e87d-4100-a682-bbe7b81183f4` |
| 3 | `POST /v1/accounts` | 201 | 35 | `qa-d7a732c1-03b9-40d6-881e-d5b2dc91b830` |
| 4 | `POST /v1/auth/token` | 200 | 23 | `qa-6f58269a-c3dd-49fb-ae57-f443c5a23eae` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-e3cf5716-5442-4325-9dad-dcb81043ecd1` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-e216f386-ccc2-4ca9-8133-b84e223f5126` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 14 | `qa-5bb9aeb9-ae1b-4fa7-95a8-40f91585e8f1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-327d5c46-9dfb-4798-8e0c-32db760d602d` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-953514a9-7a4a-4313-be60-ead54a615c5b` |
| 10 | `POST /v1/auth/token` | 200 | 11 | `qa-afe631b5-db16-4bba-81d9-aa57adf364b0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7dddea4f-4b16-44aa-b844-1de00b853db4` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-f6a8f670-bd3d-43bd-915d-910e61da5ead` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-337f80b1-b07d-462d-a5f3-58e62eb3da26` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-6ac156dc-348b-452a-8f40-558b6597255c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-379a7d8f-9616-428f-afa4-8dfe8f7fb4cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-379a7d8f-9616-428f-afa4-8dfe8f7fb4cd
Content-Type: application/json

--- request body ---
{"handle":"qa-b6edff3561c3","displayName":"QA b6edff3561c3","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-379a7d8f-9616-428f-afa4-8dfe8f7fb4cd
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
Location: /v1/accounts/qa-b6edff3561c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31b0cb8f-a5d3-4d10-93a7-1b6374ab3d60","handle":"qa-b6edff3561c3","displayName":"QA b6edff3561c3","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.442272968Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-df1f76ce-e87d-4100-a682-bbe7b81183f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df1f76ce-e87d-4100-a682-bbe7b81183f4
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc2ebef3fec","displayName":"QA 7bc2ebef3fec","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-df1f76ce-e87d-4100-a682-bbe7b81183f4
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
Location: /v1/accounts/qa-7bc2ebef3fec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa36245a-0858-431e-aa49-f1540810fb40","handle":"qa-7bc2ebef3fec","displayName":"QA 7bc2ebef3fec","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.521821558Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d7a732c1-03b9-40d6-881e-d5b2dc91b830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7a732c1-03b9-40d6-881e-d5b2dc91b830
Content-Type: application/json

--- request body ---
{"handle":"qa-3780ef05e989","displayName":"QA 3780ef05e989","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7a732c1-03b9-40d6-881e-d5b2dc91b830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Location: /v1/accounts/qa-3780ef05e989
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3415806f-3912-4d52-8680-fa512f5921f9","handle":"qa-3780ef05e989","displayName":"QA 3780ef05e989","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.563948155Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6f58269a-c3dd-49fb-ae57-f443c5a23eae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f58269a-c3dd-49fb-ae57-f443c5a23eae
Content-Type: application/json

--- request body ---
{"handle":"qa-b6edff3561c3","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f58269a-c3dd-49fb-ae57-f443c5a23eae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31b0cb8f-a5d3-4d10-93a7-1b6374ab3d60"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e3cf5716-5442-4325-9dad-dcb81043ecd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3cf5716-5442-4325-9dad-dcb81043ecd1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7bc2ebef3fec","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3cf5716-5442-4325-9dad-dcb81043ecd1
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
Location: /v1/conversations/cnv_bdd35d10-c82e-4dd8-bdaa-a6fcd335db25
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bdd35d10-c82e-4dd8-bdaa-a6fcd335db25","subject":"Error contract","status":"open","region":"eu","participants":["qa-b6edff3561c3","qa-7bc2ebef3fec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.638686647Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e216f386-ccc2-4ca9-8133-b84e223f5126

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e216f386-ccc2-4ca9-8133-b84e223f5126
Content-Type: application/json

--- request body ---
{"handle":"qa-3780ef05e989","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e216f386-ccc2-4ca9-8133-b84e223f5126
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3415806f-3912-4d52-8680-fa512f5921f9"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_bdd35d10-c82e-4dd8-bdaa-a6fcd335db25/close
correlation: qa-5bb9aeb9-ae1b-4fa7-95a8-40f91585e8f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bb9aeb9-ae1b-4fa7-95a8-40f91585e8f1
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bb9aeb9-ae1b-4fa7-95a8-40f91585e8f1
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_bdd35d10-c82e-4dd8-bdaa-a6fcd335db25/close","correlationId":"qa-5bb9aeb9-ae1b-4fa7-95a8-40f91585e8f1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-327d5c46-9dfb-4798-8e0c-32db760d602d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327d5c46-9dfb-4798-8e0c-32db760d602d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-327d5c46-9dfb-4798-8e0c-32db760d602d
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
correlation: qa-953514a9-7a4a-4313-be60-ead54a615c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-953514a9-7a4a-4313-be60-ead54a615c5b
Content-Type: application/json

--- request body ---
{"handle":"qa-3780ef05e989","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-953514a9-7a4a-4313-be60-ead54a615c5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-953514a9-7a4a-4313-be60-ead54a615c5b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-afe631b5-db16-4bba-81d9-aa57adf364b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afe631b5-db16-4bba-81d9-aa57adf364b0
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc2ebef3fec","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-afe631b5-db16-4bba-81d9-aa57adf364b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa36245a-0858-431e-aa49-f1540810fb40"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7dddea4f-4b16-44aa-b844-1de00b853db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dddea4f-4b16-44aa-b844-1de00b853db4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7dddea4f-4b16-44aa-b844-1de00b853db4
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
correlation: qa-f6a8f670-bd3d-43bd-915d-910e61da5ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6a8f670-bd3d-43bd-915d-910e61da5ead
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc2ebef3fec","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6a8f670-bd3d-43bd-915d-910e61da5ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6a8f670-bd3d-43bd-915d-910e61da5ead"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-337f80b1-b07d-462d-a5f3-58e62eb3da26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-337f80b1-b07d-462d-a5f3-58e62eb3da26
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-337f80b1-b07d-462d-a5f3-58e62eb3da26
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
correlation: qa-6ac156dc-348b-452a-8f40-558b6597255c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac156dc-348b-452a-8f40-558b6597255c
Content-Type: application/json

--- request body ---
{"handle":"qa-b6edff3561c3","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ac156dc-348b-452a-8f40-558b6597255c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ac156dc-348b-452a-8f40-558b6597255c"}
```
