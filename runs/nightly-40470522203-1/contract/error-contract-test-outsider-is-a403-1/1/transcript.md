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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-b5de0ac2-f2c9-4d67-b585-0a02ec5a48a0` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-0a5d1409-f41b-4c28-991a-3496ac96c1b2` |
| 3 | `POST /v1/accounts` | 201 | 8 | `qa-1a77f532-0e2b-4fa5-8dea-b045e2fc2661` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-0f64f03b-072e-495e-bd38-db798bba0806` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-bcf79d92-83e2-45d4-87b7-c84db05dd129` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-3157c8a8-eefe-40f9-b3d2-dd829fed8724` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-5b208b08-fe4d-45e7-8da1-8a8e4ffd9a96` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-bcf844c1-b3d7-4094-a79f-792ed2c55418` |
| 9 | `POST /v1/auth/token` | 401 | 30 | `qa-fcefba7c-0aef-419b-98ab-53ee7b32da1f` |
| 10 | `POST /v1/auth/token` | 200 | 40 | `qa-97b96a8b-214a-4272-bb82-374bf434865d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-70bfbd18-8e42-43d0-909c-0aa72babcb7e` |
| 12 | `POST /v1/auth/token` | 401 | 26 | `qa-744ece9f-ec4b-4bed-9f45-bc5030c8ee5b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-7021ff39-bf63-4044-9b42-4f67a9f73001` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-c18b4fb7-1d7d-48b2-8c34-2fd080c83925` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5de0ac2-f2c9-4d67-b585-0a02ec5a48a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5de0ac2-f2c9-4d67-b585-0a02ec5a48a0
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9667ef7e48","displayName":"QA 0a9667ef7e48","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5de0ac2-f2c9-4d67-b585-0a02ec5a48a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Location: /v1/accounts/qa-0a9667ef7e48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9134047-b3a5-41e8-9c5b-dd04510b9aef","handle":"qa-0a9667ef7e48","displayName":"QA 0a9667ef7e48","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.618474043Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a5d1409-f41b-4c28-991a-3496ac96c1b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a5d1409-f41b-4c28-991a-3496ac96c1b2
Content-Type: application/json

--- request body ---
{"handle":"qa-bff866c32e91","displayName":"QA bff866c32e91","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a5d1409-f41b-4c28-991a-3496ac96c1b2
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
Location: /v1/accounts/qa-bff866c32e91
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35e34161-2b5a-482e-a339-a8e921ff2c9f","handle":"qa-bff866c32e91","displayName":"QA bff866c32e91","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.691560754Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1a77f532-0e2b-4fa5-8dea-b045e2fc2661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a77f532-0e2b-4fa5-8dea-b045e2fc2661
Content-Type: application/json

--- request body ---
{"handle":"qa-66be27c36f0c","displayName":"QA 66be27c36f0c","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a77f532-0e2b-4fa5-8dea-b045e2fc2661
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-66be27c36f0c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a388f4d3-300c-45e3-9ebf-482850471745","handle":"qa-66be27c36f0c","displayName":"QA 66be27c36f0c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.711238028Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0f64f03b-072e-495e-bd38-db798bba0806

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f64f03b-072e-495e-bd38-db798bba0806
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9667ef7e48","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f64f03b-072e-495e-bd38-db798bba0806
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9134047-b3a5-41e8-9c5b-dd04510b9aef"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-bcf79d92-83e2-45d4-87b7-c84db05dd129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf79d92-83e2-45d4-87b7-c84db05dd129
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bff866c32e91","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcf79d92-83e2-45d4-87b7-c84db05dd129
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
Location: /v1/conversations/cnv_983cbdc1-4174-446b-94e3-3020414a2fe7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_983cbdc1-4174-446b-94e3-3020414a2fe7","subject":"Error contract","status":"open","region":"eu","participants":["qa-0a9667ef7e48","qa-bff866c32e91"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.751106549Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3157c8a8-eefe-40f9-b3d2-dd829fed8724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3157c8a8-eefe-40f9-b3d2-dd829fed8724
Content-Type: application/json

--- request body ---
{"handle":"qa-66be27c36f0c","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3157c8a8-eefe-40f9-b3d2-dd829fed8724
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a388f4d3-300c-45e3-9ebf-482850471745"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_983cbdc1-4174-446b-94e3-3020414a2fe7/messages
correlation: qa-5b208b08-fe4d-45e7-8da1-8a8e4ffd9a96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b208b08-fe4d-45e7-8da1-8a8e4ffd9a96
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b208b08-fe4d-45e7-8da1-8a8e4ffd9a96
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_983cbdc1-4174-446b-94e3-3020414a2fe7/messages","correlationId":"qa-5b208b08-fe4d-45e7-8da1-8a8e4ffd9a96"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcf844c1-b3d7-4094-a79f-792ed2c55418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf844c1-b3d7-4094-a79f-792ed2c55418
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcf844c1-b3d7-4094-a79f-792ed2c55418
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
correlation: qa-fcefba7c-0aef-419b-98ab-53ee7b32da1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcefba7c-0aef-419b-98ab-53ee7b32da1f
Content-Type: application/json

--- request body ---
{"handle":"qa-66be27c36f0c","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcefba7c-0aef-419b-98ab-53ee7b32da1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fcefba7c-0aef-419b-98ab-53ee7b32da1f"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-97b96a8b-214a-4272-bb82-374bf434865d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b96a8b-214a-4272-bb82-374bf434865d
Content-Type: application/json

--- request body ---
{"handle":"qa-bff866c32e91","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-97b96a8b-214a-4272-bb82-374bf434865d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35e34161-2b5a-482e-a339-a8e921ff2c9f"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70bfbd18-8e42-43d0-909c-0aa72babcb7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70bfbd18-8e42-43d0-909c-0aa72babcb7e
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70bfbd18-8e42-43d0-909c-0aa72babcb7e
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
correlation: qa-744ece9f-ec4b-4bed-9f45-bc5030c8ee5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-744ece9f-ec4b-4bed-9f45-bc5030c8ee5b
Content-Type: application/json

--- request body ---
{"handle":"qa-bff866c32e91","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-744ece9f-ec4b-4bed-9f45-bc5030c8ee5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-744ece9f-ec4b-4bed-9f45-bc5030c8ee5b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7021ff39-bf63-4044-9b42-4f67a9f73001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7021ff39-bf63-4044-9b42-4f67a9f73001
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7021ff39-bf63-4044-9b42-4f67a9f73001
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
correlation: qa-c18b4fb7-1d7d-48b2-8c34-2fd080c83925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c18b4fb7-1d7d-48b2-8c34-2fd080c83925
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9667ef7e48","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c18b4fb7-1d7d-48b2-8c34-2fd080c83925
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c18b4fb7-1d7d-48b2-8c34-2fd080c83925"}
```
