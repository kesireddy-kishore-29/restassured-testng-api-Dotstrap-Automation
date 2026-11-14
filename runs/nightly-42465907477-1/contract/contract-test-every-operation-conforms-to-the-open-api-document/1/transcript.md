# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 304 | `qa-150ac2cf-ec2b-411b-a0dd-06b647b5fa8b` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-b4b23793-317a-4fd2-9ce4-89af56def622` |
| 3 | `GET /health` | 200 | 37 | `qa-926a00e2-5ea9-4f6b-aa29-491d1bcf18c5` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-00f53c75-502b-40ba-b119-36ed6985c511` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-c523219e-d6b5-4337-b078-4e6c065b5c55` |
| 6 | `PATCH /v1/accounts/me` | 200 | 23 | `qa-e4a1c463-97bc-4f82-9697-7c24d57e866b` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-a910ebb7-c2b7-4d67-8884-91745a214d3f` |
| 8 | `POST /v1/conversations` | 201 | 14 | `qa-1030312d-5d7e-4a86-914d-7d233f34781e` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-b338f20b-9d83-43bd-b764-177a687b89e2` |
| 10 | `POST /v1/auth/token` | 200 | 15 | `qa-ab8ae2c9-d1f5-4e24-a095-bb920e5ff767` |
| 11 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-f097dae8-ca5b-4103-9719-ade493b8a6c7` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-a6d9415d-ddfb-4014-9319-7329344db453` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-bdf02c55-028f-462d-b222-9e9a53fdf2c0` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-dd536bef-c375-4219-b1c9-e42b935d6be3` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-1f3fef82-db86-4646-9a8e-3ef811388b7a` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-f61244a7-fd31-4351-84a2-5c261d71e334` |
| 17 | `GET /v1/credits/ledger` | 200 | 9 | `qa-fdca2686-6df3-4b8f-9e5e-14d46f012954` |
| 18 | `POST /v1/credits/purchases` | 201 | 4 | `qa-9460d995-8dab-4535-bbe1-7a4434e44547` |
| 19 | `GET /v1/admin/stats` | 403 | 11 | `qa-8395b424-5926-4863-89d7-e7272cbf4940` |
| 20 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-6833a828-da52-4461-9d53-216ff3f8039f` |
| 21 | `POST /v1/auth/token` | 401 | 4 | `qa-e897ab98-8943-424e-a5c4-ca37c9a2e7cb` |
| 22 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d4afd765-2926-4505-b105-e40efbd9007c` |
| 23 | `POST /v1/auth/token` | 401 | 13 | `qa-63477c0e-a9df-4ac5-b7c2-af365f926079` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-150ac2cf-ec2b-411b-a0dd-06b647b5fa8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150ac2cf-ec2b-411b-a0dd-06b647b5fa8b
Content-Type: application/json

--- request body ---
{"handle":"qa-2726cca44876","displayName":"QA 2726cca44876","password":"****","region":"eu"}

--- response: 201 in 304 ms ---
Date: Sun, 08 Nov 2026 09:09:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-150ac2cf-ec2b-411b-a0dd-06b647b5fa8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-2726cca44876
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b00fb481-eb4e-4e57-9f9a-bb32af6f32c0","handle":"qa-2726cca44876","displayName":"QA 2726cca44876","region":"eu","role":"user","createdAt":"2026-11-08T09:09:00.982874970Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b4b23793-317a-4fd2-9ce4-89af56def622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4b23793-317a-4fd2-9ce4-89af56def622
Content-Type: application/json

--- request body ---
{"handle":"qa-3a23427fb333","displayName":"QA 3a23427fb333","password":"****","region":"us"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4b23793-317a-4fd2-9ce4-89af56def622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-3a23427fb333
X-Served-Region: us
Content-Length: 181

{"id":"acc_837cbca8-2c97-4f79-bda4-5b415a4d4d82","handle":"qa-3a23427fb333","displayName":"QA 3a23427fb333","region":"us","role":"user","createdAt":"2026-11-08T09:09:01.255368820Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-926a00e2-5ea9-4f6b-aa29-491d1bcf18c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-926a00e2-5ea9-4f6b-aa29-491d1bcf18c5
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-926a00e2-5ea9-4f6b-aa29-491d1bcf18c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-00f53c75-502b-40ba-b119-36ed6985c511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00f53c75-502b-40ba-b119-36ed6985c511
Content-Type: application/json

--- request body ---
{"handle":"qa-2726cca44876","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-00f53c75-502b-40ba-b119-36ed6985c511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b00fb481-eb4e-4e57-9f9a-bb32af6f32c0"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c523219e-d6b5-4337-b078-4e6c065b5c55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c523219e-d6b5-4337-b078-4e6c065b5c55
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c523219e-d6b5-4337-b078-4e6c065b5c55
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
Content-Length: 181

{"id":"acc_b00fb481-eb4e-4e57-9f9a-bb32af6f32c0","handle":"qa-2726cca44876","displayName":"QA 2726cca44876","region":"eu","role":"user","createdAt":"2026-11-08T09:09:00.982874970Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e4a1c463-97bc-4f82-9697-7c24d57e866b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4a1c463-97bc-4f82-9697-7c24d57e866b
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4a1c463-97bc-4f82-9697-7c24d57e866b
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
Content-Length: 178

{"id":"acc_b00fb481-eb4e-4e57-9f9a-bb32af6f32c0","handle":"qa-2726cca44876","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-08T09:09:00.982874970Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-3a23427fb333
correlation: qa-a910ebb7-c2b7-4d67-8884-91745a214d3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a910ebb7-c2b7-4d67-8884-91745a214d3f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a910ebb7-c2b7-4d67-8884-91745a214d3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-3a23427fb333","displayName":"QA 3a23427fb333","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-1030312d-5d7e-4a86-914d-7d233f34781e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1030312d-5d7e-4a86-914d-7d233f34781e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3a23427fb333","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1030312d-5d7e-4a86-914d-7d233f34781e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-2726cca44876","qa-3a23427fb333"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.452728526Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-b338f20b-9d83-43bd-b764-177a687b89e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b338f20b-9d83-43bd-b764-177a687b89e2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b338f20b-9d83-43bd-b764-177a687b89e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-2726cca44876","qa-3a23427fb333"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.452728526Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ab8ae2c9-d1f5-4e24-a095-bb920e5ff767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab8ae2c9-d1f5-4e24-a095-bb920e5ff767
Content-Type: application/json

--- request body ---
{"handle":"qa-3a23427fb333","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab8ae2c9-d1f5-4e24-a095-bb920e5ff767
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_837cbca8-2c97-4f79-bda4-5b415a4d4d82"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9
correlation: qa-f097dae8-ca5b-4103-9719-ade493b8a6c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f097dae8-ca5b-4103-9719-ade493b8a6c7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f097dae8-ca5b-4103-9719-ade493b8a6c7
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-2726cca44876","qa-3a23427fb333"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-08T09:09:01.452728526Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9/messages
correlation: qa-a6d9415d-ddfb-4014-9319-7329344db453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d9415d-ddfb-4014-9319-7329344db453
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6d9415d-ddfb-4014-9319-7329344db453
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_68a568b9-e1e7-4fbe-9e12-9eef5fb3dd9a","conversationId":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","sender":"qa-2726cca44876","body":"Hi","createdAt":"2026-11-08T09:09:01.452747775Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9/messages
correlation: qa-bdf02c55-028f-462d-b222-9e9a53fdf2c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdf02c55-028f-462d-b222-9e9a53fdf2c0
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdf02c55-028f-462d-b222-9e9a53fdf2c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 196

{"id":"msg_3d199262-07a2-4361-9059-912dbdd7b6c1","conversationId":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","sender":"qa-3a23427fb333","body":"Reply","createdAt":"2026-11-08T09:09:01.539540433Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9/read
correlation: qa-dd536bef-c375-4219-b1c9-e42b935d6be3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd536bef-c375-4219-b1c9-e42b935d6be3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd536bef-c375-4219-b1c9-e42b935d6be3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9/close
correlation: qa-1f3fef82-db86-4646-9a8e-3ef811388b7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f3fef82-db86-4646-9a8e-3ef811388b7a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f3fef82-db86-4646-9a8e-3ef811388b7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-2726cca44876","qa-3a23427fb333"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.452728526Z","closedAt":"2026-11-08T09:09:01.578539823Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-f61244a7-fd31-4351-84a2-5c261d71e334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61244a7-fd31-4351-84a2-5c261d71e334
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f61244a7-fd31-4351-84a2-5c261d71e334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_b00fb481-eb4e-4e57-9f9a-bb32af6f32c0"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fdca2686-6df3-4b8f-9e5e-14d46f012954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdca2686-6df3-4b8f-9e5e-14d46f012954
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdca2686-6df3-4b8f-9e5e-14d46f012954
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_b95b07ce-22c8-402e-af62-9f75e6748f28","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:00.983109484Z"},{"id":"led_45d9b7e0-479a-4d9a-8b1c-3c3ea3ba3e79","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_3bb74ae9-5ca4-4006-97ad-fd45686012d9","createdAt":"2026-11-08T09:09:01.452716538Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9460d995-8dab-4535-bbe1-7a4434e44547

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bef66c3b89b943edb6d41dc698fe742d
X-Correlation-Id: qa-9460d995-8dab-4535-bbe1-7a4434e44547
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9460d995-8dab-4535-bbe1-7a4434e44547
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_53feb401-1342-4e02-a9b7-ba5929854859
Content-Length: 144

{"id":"pur_53feb401-1342-4e02-a9b7-ba5929854859","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-08T09:09:01.614734047Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-8395b424-5926-4863-89d7-e7272cbf4940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8395b424-5926-4863-89d7-e7272cbf4940
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8395b424-5926-4863-89d7-e7272cbf4940
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-8395b424-5926-4863-89d7-e7272cbf4940"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6833a828-da52-4461-9d53-216ff3f8039f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6833a828-da52-4461-9d53-216ff3f8039f
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6833a828-da52-4461-9d53-216ff3f8039f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-e897ab98-8943-424e-a5c4-ca37c9a2e7cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e897ab98-8943-424e-a5c4-ca37c9a2e7cb
Content-Type: application/json

--- request body ---
{"handle":"qa-3a23427fb333","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e897ab98-8943-424e-a5c4-ca37c9a2e7cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e897ab98-8943-424e-a5c4-ca37c9a2e7cb"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d4afd765-2926-4505-b105-e40efbd9007c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4afd765-2926-4505-b105-e40efbd9007c
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d4afd765-2926-4505-b105-e40efbd9007c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-63477c0e-a9df-4ac5-b7c2-af365f926079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63477c0e-a9df-4ac5-b7c2-af365f926079
Content-Type: application/json

--- request body ---
{"handle":"qa-2726cca44876","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63477c0e-a9df-4ac5-b7c2-af365f926079
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63477c0e-a9df-4ac5-b7c2-af365f926079"}
```
