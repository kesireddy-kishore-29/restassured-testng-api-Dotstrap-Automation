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
| 1 | `POST /v1/accounts` | 201 | 475 | `qa-0382c5c4-fd7b-4dbe-bbc1-496429e1d45b` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-7c63d71c-2890-4bc4-ba53-a6543829ba31` |
| 3 | `POST /v1/accounts` | 201 | 58 | `qa-80db852c-093c-4224-8802-18097d0880df` |
| 4 | `POST /v1/auth/token` | 200 | 70 | `qa-fb86523d-9052-44e6-9563-3085b1888306` |
| 5 | `POST /v1/conversations` | 201 | 84 | `qa-8a3d3f69-f144-4146-adcb-d4053ee13841` |
| 6 | `POST /v1/auth/token` | 200 | 65 | `qa-87d2734b-c1e7-4a83-bb63-24f9a92eb268` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 25 | `qa-edea76cb-3912-4a07-bd00-a38aff7706f5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-9dc8eabe-789d-4552-b561-9c03632b1362` |
| 9 | `POST /v1/auth/token` | 401 | 43 | `qa-6dec971e-400e-4979-ab03-b4eb52a0bc58` |
| 10 | `POST /v1/auth/token` | 200 | 98 | `qa-a932eca5-aceb-49ec-b3b2-ed39ea2a21f6` |
| 11 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-44175c43-12f7-46b9-bd63-76bf86f22c63` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-0f72a7e3-06ed-43c5-8606-fe71efd194bf` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-9a4a6a94-a202-4c5b-9c27-22f7fc8b584b` |
| 14 | `POST /v1/auth/token` | 401 | 30 | `qa-ceac0692-a1ee-419c-be4c-cff10a2e78d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0382c5c4-fd7b-4dbe-bbc1-496429e1d45b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0382c5c4-fd7b-4dbe-bbc1-496429e1d45b
Content-Type: application/json

--- request body ---
{"handle":"qa-6ddc1f9f962b","displayName":"QA 6ddc1f9f962b","password":"****","region":"eu"}

--- response: 201 in 475 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0382c5c4-fd7b-4dbe-bbc1-496429e1d45b
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
Location: /v1/accounts/qa-6ddc1f9f962b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b206ba86-6de1-4855-a865-71c8d9100184","handle":"qa-6ddc1f9f962b","displayName":"QA 6ddc1f9f962b","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.395608427Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7c63d71c-2890-4bc4-ba53-a6543829ba31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c63d71c-2890-4bc4-ba53-a6543829ba31
Content-Type: application/json

--- request body ---
{"handle":"qa-8e36bb464ca4","displayName":"QA 8e36bb464ca4","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c63d71c-2890-4bc4-ba53-a6543829ba31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-8e36bb464ca4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8dfe73ac-3dc8-4471-833a-d189dfd99ab1","handle":"qa-8e36bb464ca4","displayName":"QA 8e36bb464ca4","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.841493746Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-80db852c-093c-4224-8802-18097d0880df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80db852c-093c-4224-8802-18097d0880df
Content-Type: application/json

--- request body ---
{"handle":"qa-0846f5d7e6f0","displayName":"QA 0846f5d7e6f0","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-80db852c-093c-4224-8802-18097d0880df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-0846f5d7e6f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22a4ac36-739c-449b-a826-27fe965296ae","handle":"qa-0846f5d7e6f0","displayName":"QA 0846f5d7e6f0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.951810754Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-fb86523d-9052-44e6-9563-3085b1888306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb86523d-9052-44e6-9563-3085b1888306
Content-Type: application/json

--- request body ---
{"handle":"qa-6ddc1f9f962b","password":"****"}

--- response: 200 in 70 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb86523d-9052-44e6-9563-3085b1888306
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b206ba86-6de1-4855-a865-71c8d9100184"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8a3d3f69-f144-4146-adcb-d4053ee13841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a3d3f69-f144-4146-adcb-d4053ee13841
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e36bb464ca4","subject":"Error contract","message":"Hi"}

--- response: 201 in 84 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a3d3f69-f144-4146-adcb-d4053ee13841
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
Location: /v1/conversations/cnv_ef1c0b04-ae91-464d-b5dc-4142fbac094a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ef1c0b04-ae91-464d-b5dc-4142fbac094a","subject":"Error contract","status":"open","region":"eu","participants":["qa-6ddc1f9f962b","qa-8e36bb464ca4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.196776858Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-87d2734b-c1e7-4a83-bb63-24f9a92eb268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87d2734b-c1e7-4a83-bb63-24f9a92eb268
Content-Type: application/json

--- request body ---
{"handle":"qa-0846f5d7e6f0","password":"****"}

--- response: 200 in 65 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-87d2734b-c1e7-4a83-bb63-24f9a92eb268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22a4ac36-739c-449b-a826-27fe965296ae"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ef1c0b04-ae91-464d-b5dc-4142fbac094a/messages
correlation: qa-edea76cb-3912-4a07-bd00-a38aff7706f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edea76cb-3912-4a07-bd00-a38aff7706f5
Content-Type: application/json

--- response: 403 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edea76cb-3912-4a07-bd00-a38aff7706f5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ef1c0b04-ae91-464d-b5dc-4142fbac094a/messages","correlationId":"qa-edea76cb-3912-4a07-bd00-a38aff7706f5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9dc8eabe-789d-4552-b561-9c03632b1362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dc8eabe-789d-4552-b561-9c03632b1362
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9dc8eabe-789d-4552-b561-9c03632b1362
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
correlation: qa-6dec971e-400e-4979-ab03-b4eb52a0bc58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dec971e-400e-4979-ab03-b4eb52a0bc58
Content-Type: application/json

--- request body ---
{"handle":"qa-0846f5d7e6f0","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6dec971e-400e-4979-ab03-b4eb52a0bc58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6dec971e-400e-4979-ab03-b4eb52a0bc58"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a932eca5-aceb-49ec-b3b2-ed39ea2a21f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a932eca5-aceb-49ec-b3b2-ed39ea2a21f6
Content-Type: application/json

--- request body ---
{"handle":"qa-8e36bb464ca4","password":"****"}

--- response: 200 in 98 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a932eca5-aceb-49ec-b3b2-ed39ea2a21f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8dfe73ac-3dc8-4471-833a-d189dfd99ab1"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44175c43-12f7-46b9-bd63-76bf86f22c63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44175c43-12f7-46b9-bd63-76bf86f22c63
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44175c43-12f7-46b9-bd63-76bf86f22c63
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
correlation: qa-0f72a7e3-06ed-43c5-8606-fe71efd194bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f72a7e3-06ed-43c5-8606-fe71efd194bf
Content-Type: application/json

--- request body ---
{"handle":"qa-8e36bb464ca4","password":"****"}

--- response: 401 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f72a7e3-06ed-43c5-8606-fe71efd194bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f72a7e3-06ed-43c5-8606-fe71efd194bf"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a4a6a94-a202-4c5b-9c27-22f7fc8b584b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a4a6a94-a202-4c5b-9c27-22f7fc8b584b
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a4a6a94-a202-4c5b-9c27-22f7fc8b584b
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
correlation: qa-ceac0692-a1ee-419c-be4c-cff10a2e78d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceac0692-a1ee-419c-be4c-cff10a2e78d5
Content-Type: application/json

--- request body ---
{"handle":"qa-6ddc1f9f962b","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ceac0692-a1ee-419c-be4c-cff10a2e78d5
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ceac0692-a1ee-419c-be4c-cff10a2e78d5"}
```
