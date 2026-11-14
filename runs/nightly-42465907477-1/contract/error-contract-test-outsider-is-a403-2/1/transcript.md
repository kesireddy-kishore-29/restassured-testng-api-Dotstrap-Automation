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
| 1 | `POST /v1/accounts` | 201 | 5 | `qa-c7e7d1c2-46aa-43d0-9254-9f9eabbf6e81` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-f0066157-874e-4b88-bf23-821345c50bd4` |
| 3 | `POST /v1/accounts` | 201 | 44 | `qa-fd6b1b06-8010-4ab2-88f7-fae26f331bb5` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-e1822d26-8b5d-4644-ad49-8395714a4ed7` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-3a893c82-9a90-4ad1-b6aa-f3b88a908bbc` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-d254eb10-2140-4b0a-98ed-b02e69f30d55` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-364cc401-f51e-4c66-98fd-83e2c1b4a07e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-87e6a21c-faac-4933-9f4c-59a2e227e6e5` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-7f0aa447-be87-4fe0-8a07-321a6ccf7ab4` |
| 10 | `POST /v1/auth/token` | 200 | 12 | `qa-61e97eb9-94ee-4b44-8b29-c95813fc944d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-454dac41-d542-4535-90ab-eb70ca64340b` |
| 12 | `POST /v1/auth/token` | 401 | 39 | `qa-c0b5a075-96fa-4a2b-8af8-0a021bc8a935` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-21e03bef-8d62-4213-8e6a-b3910edcfb86` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-15bb9572-cb5d-49f1-ab7d-8e2f8c3a112f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c7e7d1c2-46aa-43d0-9254-9f9eabbf6e81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7e7d1c2-46aa-43d0-9254-9f9eabbf6e81
Content-Type: application/json

--- request body ---
{"handle":"qa-7c816ecd53df","displayName":"QA 7c816ecd53df","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7e7d1c2-46aa-43d0-9254-9f9eabbf6e81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Location: /v1/accounts/qa-7c816ecd53df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea7d0c28-a1cf-4f3f-8bef-fcf0fd47196f","handle":"qa-7c816ecd53df","displayName":"QA 7c816ecd53df","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.756317650Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0066157-874e-4b88-bf23-821345c50bd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0066157-874e-4b88-bf23-821345c50bd4
Content-Type: application/json

--- request body ---
{"handle":"qa-c6e3ed4ce76b","displayName":"QA c6e3ed4ce76b","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0066157-874e-4b88-bf23-821345c50bd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Location: /v1/accounts/qa-c6e3ed4ce76b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39864817-9e7e-47e0-820a-45db98b3a3ae","handle":"qa-c6e3ed4ce76b","displayName":"QA c6e3ed4ce76b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.801395939Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-fd6b1b06-8010-4ab2-88f7-fae26f331bb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6b1b06-8010-4ab2-88f7-fae26f331bb5
Content-Type: application/json

--- request body ---
{"handle":"qa-12150cbb3a60","displayName":"QA 12150cbb3a60","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd6b1b06-8010-4ab2-88f7-fae26f331bb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 10
Location: /v1/accounts/qa-12150cbb3a60
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b743104-dea2-4ee6-a239-55a66a95d6a0","handle":"qa-12150cbb3a60","displayName":"QA 12150cbb3a60","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.863714897Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e1822d26-8b5d-4644-ad49-8395714a4ed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1822d26-8b5d-4644-ad49-8395714a4ed7
Content-Type: application/json

--- request body ---
{"handle":"qa-7c816ecd53df","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1822d26-8b5d-4644-ad49-8395714a4ed7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea7d0c28-a1cf-4f3f-8bef-fcf0fd47196f"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3a893c82-9a90-4ad1-b6aa-f3b88a908bbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a893c82-9a90-4ad1-b6aa-f3b88a908bbc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c6e3ed4ce76b","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a893c82-9a90-4ad1-b6aa-f3b88a908bbc
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
Location: /v1/conversations/cnv_7896ae06-bc79-45eb-9f9a-0cbdbb10d5c6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7896ae06-bc79-45eb-9f9a-0cbdbb10d5c6","subject":"Error contract","status":"open","region":"eu","participants":["qa-7c816ecd53df","qa-c6e3ed4ce76b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.917062628Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d254eb10-2140-4b0a-98ed-b02e69f30d55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d254eb10-2140-4b0a-98ed-b02e69f30d55
Content-Type: application/json

--- request body ---
{"handle":"qa-12150cbb3a60","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d254eb10-2140-4b0a-98ed-b02e69f30d55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b743104-dea2-4ee6-a239-55a66a95d6a0"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7896ae06-bc79-45eb-9f9a-0cbdbb10d5c6/messages
correlation: qa-364cc401-f51e-4c66-98fd-83e2c1b4a07e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364cc401-f51e-4c66-98fd-83e2c1b4a07e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-364cc401-f51e-4c66-98fd-83e2c1b4a07e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7896ae06-bc79-45eb-9f9a-0cbdbb10d5c6/messages","correlationId":"qa-364cc401-f51e-4c66-98fd-83e2c1b4a07e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87e6a21c-faac-4933-9f4c-59a2e227e6e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87e6a21c-faac-4933-9f4c-59a2e227e6e5
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87e6a21c-faac-4933-9f4c-59a2e227e6e5
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
correlation: qa-7f0aa447-be87-4fe0-8a07-321a6ccf7ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f0aa447-be87-4fe0-8a07-321a6ccf7ab4
Content-Type: application/json

--- request body ---
{"handle":"qa-12150cbb3a60","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f0aa447-be87-4fe0-8a07-321a6ccf7ab4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f0aa447-be87-4fe0-8a07-321a6ccf7ab4"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-61e97eb9-94ee-4b44-8b29-c95813fc944d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61e97eb9-94ee-4b44-8b29-c95813fc944d
Content-Type: application/json

--- request body ---
{"handle":"qa-c6e3ed4ce76b","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-61e97eb9-94ee-4b44-8b29-c95813fc944d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39864817-9e7e-47e0-820a-45db98b3a3ae"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-454dac41-d542-4535-90ab-eb70ca64340b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454dac41-d542-4535-90ab-eb70ca64340b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-454dac41-d542-4535-90ab-eb70ca64340b
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
correlation: qa-c0b5a075-96fa-4a2b-8af8-0a021bc8a935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0b5a075-96fa-4a2b-8af8-0a021bc8a935
Content-Type: application/json

--- request body ---
{"handle":"qa-c6e3ed4ce76b","password":"****"}

--- response: 401 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0b5a075-96fa-4a2b-8af8-0a021bc8a935
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0b5a075-96fa-4a2b-8af8-0a021bc8a935"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21e03bef-8d62-4213-8e6a-b3910edcfb86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21e03bef-8d62-4213-8e6a-b3910edcfb86
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21e03bef-8d62-4213-8e6a-b3910edcfb86
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
correlation: qa-15bb9572-cb5d-49f1-ab7d-8e2f8c3a112f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15bb9572-cb5d-49f1-ab7d-8e2f8c3a112f
Content-Type: application/json

--- request body ---
{"handle":"qa-7c816ecd53df","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15bb9572-cb5d-49f1-ab7d-8e2f8c3a112f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15bb9572-cb5d-49f1-ab7d-8e2f8c3a112f"}
```
