# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 515 | `qa-29856cf9-72e8-452a-9347-69fc59f8ade5` |
| 2 | `POST /v1/accounts` | 201 | 96 | `qa-931c6d74-9547-4cc3-9411-7ba10ec77189` |
| 3 | `POST /v1/accounts` | 201 | 55 | `qa-f3ff0bc9-45e3-4fa7-acee-c5c53e1bfd55` |
| 4 | `POST /v1/auth/token` | 200 | 50 | `qa-608472d9-ba41-422f-b7bd-f96acd10889e` |
| 5 | `POST /v1/conversations` | 201 | 72 | `qa-ffa3ac50-c078-48ca-8ed4-b80dddb5c724` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-96b2538a-825f-4373-92e7-0ba661566b28` |
| 7 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-ec9059f5-9213-4c00-bd8d-f0db3c552db6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-93072c24-dc94-4746-bc5c-12fdc6d07b52` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-7f4de7b5-2a4d-4f85-be00-477ea3d0d37c` |
| 10 | `POST /v1/auth/token` | 200 | 55 | `qa-65e17ca2-50d9-472b-a289-3751be350079` |
| 11 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-2196f725-e6e1-44d7-bd49-ef368ef4bd65` |
| 12 | `POST /v1/auth/token` | 401 | 32 | `qa-3965c7d6-51fd-4bc9-9ada-d33b3d369c3e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-e4d549a5-b577-4ec3-bb60-66ce5b4e3365` |
| 14 | `POST /v1/auth/token` | 401 | 39 | `qa-5254940e-0f4d-46b3-9680-053cf380d932` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29856cf9-72e8-452a-9347-69fc59f8ade5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29856cf9-72e8-452a-9347-69fc59f8ade5
Content-Type: application/json

--- request body ---
{"handle":"qa-ac9c18cbeb78","displayName":"QA ac9c18cbeb78","password":"****","region":"eu"}

--- response: 201 in 515 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-29856cf9-72e8-452a-9347-69fc59f8ade5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-ac9c18cbeb78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_086a5c1e-1dd6-4169-bfe6-45c360d77f93","handle":"qa-ac9c18cbeb78","displayName":"QA ac9c18cbeb78","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.397856036Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-931c6d74-9547-4cc3-9411-7ba10ec77189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931c6d74-9547-4cc3-9411-7ba10ec77189
Content-Type: application/json

--- request body ---
{"handle":"qa-4e353d0f164e","displayName":"QA 4e353d0f164e","password":"****","region":"eu"}

--- response: 201 in 96 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-931c6d74-9547-4cc3-9411-7ba10ec77189
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
Location: /v1/accounts/qa-4e353d0f164e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6851f0c-0be7-43dd-9e34-53ae39a1cc0a","handle":"qa-4e353d0f164e","displayName":"QA 4e353d0f164e","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.892596308Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f3ff0bc9-45e3-4fa7-acee-c5c53e1bfd55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ff0bc9-45e3-4fa7-acee-c5c53e1bfd55
Content-Type: application/json

--- request body ---
{"handle":"qa-7a46754f2df2","displayName":"QA 7a46754f2df2","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3ff0bc9-45e3-4fa7-acee-c5c53e1bfd55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-7a46754f2df2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50fd7667-11a4-4d44-b720-01e24b8e29a1","handle":"qa-7a46754f2df2","displayName":"QA 7a46754f2df2","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.997419417Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-608472d9-ba41-422f-b7bd-f96acd10889e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608472d9-ba41-422f-b7bd-f96acd10889e
Content-Type: application/json

--- request body ---
{"handle":"qa-ac9c18cbeb78","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-608472d9-ba41-422f-b7bd-f96acd10889e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_086a5c1e-1dd6-4169-bfe6-45c360d77f93"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ffa3ac50-c078-48ca-8ed4-b80dddb5c724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffa3ac50-c078-48ca-8ed4-b80dddb5c724
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e353d0f164e","subject":"Error contract","message":"Hi"}

--- response: 201 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffa3ac50-c078-48ca-8ed4-b80dddb5c724
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
Location: /v1/conversations/cnv_d9610122-7352-4ed1-92f7-2f2cddc31335
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d9610122-7352-4ed1-92f7-2f2cddc31335","subject":"Error contract","status":"open","region":"eu","participants":["qa-ac9c18cbeb78","qa-4e353d0f164e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.202341288Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-96b2538a-825f-4373-92e7-0ba661566b28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b2538a-825f-4373-92e7-0ba661566b28
Content-Type: application/json

--- request body ---
{"handle":"qa-7a46754f2df2","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-96b2538a-825f-4373-92e7-0ba661566b28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50fd7667-11a4-4d44-b720-01e24b8e29a1"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_d9610122-7352-4ed1-92f7-2f2cddc31335
correlation: qa-ec9059f5-9213-4c00-bd8d-f0db3c552db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec9059f5-9213-4c00-bd8d-f0db3c552db6
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec9059f5-9213-4c00-bd8d-f0db3c552db6
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d9610122-7352-4ed1-92f7-2f2cddc31335","correlationId":"qa-ec9059f5-9213-4c00-bd8d-f0db3c552db6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93072c24-dc94-4746-bc5c-12fdc6d07b52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93072c24-dc94-4746-bc5c-12fdc6d07b52
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93072c24-dc94-4746-bc5c-12fdc6d07b52
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
correlation: qa-7f4de7b5-2a4d-4f85-be00-477ea3d0d37c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f4de7b5-2a4d-4f85-be00-477ea3d0d37c
Content-Type: application/json

--- request body ---
{"handle":"qa-7a46754f2df2","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f4de7b5-2a4d-4f85-be00-477ea3d0d37c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f4de7b5-2a4d-4f85-be00-477ea3d0d37c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-65e17ca2-50d9-472b-a289-3751be350079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65e17ca2-50d9-472b-a289-3751be350079
Content-Type: application/json

--- request body ---
{"handle":"qa-4e353d0f164e","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-65e17ca2-50d9-472b-a289-3751be350079
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6851f0c-0be7-43dd-9e34-53ae39a1cc0a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2196f725-e6e1-44d7-bd49-ef368ef4bd65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2196f725-e6e1-44d7-bd49-ef368ef4bd65
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2196f725-e6e1-44d7-bd49-ef368ef4bd65
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
correlation: qa-3965c7d6-51fd-4bc9-9ada-d33b3d369c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3965c7d6-51fd-4bc9-9ada-d33b3d369c3e
Content-Type: application/json

--- request body ---
{"handle":"qa-4e353d0f164e","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3965c7d6-51fd-4bc9-9ada-d33b3d369c3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3965c7d6-51fd-4bc9-9ada-d33b3d369c3e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4d549a5-b577-4ec3-bb60-66ce5b4e3365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4d549a5-b577-4ec3-bb60-66ce5b4e3365
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4d549a5-b577-4ec3-bb60-66ce5b4e3365
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
correlation: qa-5254940e-0f4d-46b3-9680-053cf380d932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5254940e-0f4d-46b3-9680-053cf380d932
Content-Type: application/json

--- request body ---
{"handle":"qa-ac9c18cbeb78","password":"****"}

--- response: 401 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5254940e-0f4d-46b3-9680-053cf380d932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5254940e-0f4d-46b3-9680-053cf380d932"}
```
