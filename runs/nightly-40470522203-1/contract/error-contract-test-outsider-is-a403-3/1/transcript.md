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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-f8a85167-6671-4d5f-b87f-22110c8f4c48` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-2bc66e02-787d-4628-bb03-81e5c9454f49` |
| 3 | `POST /v1/accounts` | 201 | 23 | `qa-1c3ced49-1e1d-4176-9bdf-6c4d7c81f8e3` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-06184446-f54f-42b4-bc20-bde209972f27` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-f7077907-3a12-48db-9be5-4bbddd342e70` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-674709cd-8abb-40ff-949b-3dab41f3fef8` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 12 | `qa-009944e9-4fa7-497d-80ca-65e404a22da2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ab6a3fd5-251d-4db5-b658-63659d7030d0` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-55fcd632-0495-430a-946c-7981b93c6785` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-6c503102-3f42-45ed-9e2c-c73ff86ae4bd` |
| 11 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-d678849c-6bd1-489f-9c28-9ca4c0b942cd` |
| 12 | `POST /v1/auth/token` | 401 | 37 | `qa-d0ebaa7b-8347-41ac-806a-5b6da63c6ddd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-121b46fb-becf-4638-95ae-a8de3de6e817` |
| 14 | `POST /v1/auth/token` | 401 | 77 | `qa-439edfde-fb43-4f98-ab4b-70e36c29f29d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f8a85167-6671-4d5f-b87f-22110c8f4c48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8a85167-6671-4d5f-b87f-22110c8f4c48
Content-Type: application/json

--- request body ---
{"handle":"qa-2e8fcddfcb36","displayName":"QA 2e8fcddfcb36","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8a85167-6671-4d5f-b87f-22110c8f4c48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Location: /v1/accounts/qa-2e8fcddfcb36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b80dbb13-cd23-4175-8d4d-3a939e5f616b","handle":"qa-2e8fcddfcb36","displayName":"QA 2e8fcddfcb36","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.620152255Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2bc66e02-787d-4628-bb03-81e5c9454f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc66e02-787d-4628-bb03-81e5c9454f49
Content-Type: application/json

--- request body ---
{"handle":"qa-0a461198c067","displayName":"QA 0a461198c067","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc66e02-787d-4628-bb03-81e5c9454f49
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
Location: /v1/accounts/qa-0a461198c067
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ba03bc7-2bc0-41e8-9926-dff243a8aca6","handle":"qa-0a461198c067","displayName":"QA 0a461198c067","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.681545058Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1c3ced49-1e1d-4176-9bdf-6c4d7c81f8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c3ced49-1e1d-4176-9bdf-6c4d7c81f8e3
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc25ab4650b","displayName":"QA ffc25ab4650b","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c3ced49-1e1d-4176-9bdf-6c4d7c81f8e3
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
Location: /v1/accounts/qa-ffc25ab4650b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f888b715-c0a6-4da9-9ca7-769c3d1ccc2e","handle":"qa-ffc25ab4650b","displayName":"QA ffc25ab4650b","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.717883509Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-06184446-f54f-42b4-bc20-bde209972f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06184446-f54f-42b4-bc20-bde209972f27
Content-Type: application/json

--- request body ---
{"handle":"qa-2e8fcddfcb36","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-06184446-f54f-42b4-bc20-bde209972f27
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b80dbb13-cd23-4175-8d4d-3a939e5f616b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f7077907-3a12-48db-9be5-4bbddd342e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7077907-3a12-48db-9be5-4bbddd342e70
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a461198c067","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7077907-3a12-48db-9be5-4bbddd342e70
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
Location: /v1/conversations/cnv_2707e2ae-5f03-4b78-8d8b-9a057710fcda
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2707e2ae-5f03-4b78-8d8b-9a057710fcda","subject":"Error contract","status":"open","region":"eu","participants":["qa-2e8fcddfcb36","qa-0a461198c067"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.784118679Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-674709cd-8abb-40ff-949b-3dab41f3fef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674709cd-8abb-40ff-949b-3dab41f3fef8
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc25ab4650b","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-674709cd-8abb-40ff-949b-3dab41f3fef8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f888b715-c0a6-4da9-9ca7-769c3d1ccc2e"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_2707e2ae-5f03-4b78-8d8b-9a057710fcda/read
correlation: qa-009944e9-4fa7-497d-80ca-65e404a22da2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-009944e9-4fa7-497d-80ca-65e404a22da2
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-009944e9-4fa7-497d-80ca-65e404a22da2
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2707e2ae-5f03-4b78-8d8b-9a057710fcda/read","correlationId":"qa-009944e9-4fa7-497d-80ca-65e404a22da2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab6a3fd5-251d-4db5-b658-63659d7030d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab6a3fd5-251d-4db5-b658-63659d7030d0
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab6a3fd5-251d-4db5-b658-63659d7030d0
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
correlation: qa-55fcd632-0495-430a-946c-7981b93c6785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55fcd632-0495-430a-946c-7981b93c6785
Content-Type: application/json

--- request body ---
{"handle":"qa-ffc25ab4650b","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55fcd632-0495-430a-946c-7981b93c6785
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55fcd632-0495-430a-946c-7981b93c6785"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6c503102-3f42-45ed-9e2c-c73ff86ae4bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c503102-3f42-45ed-9e2c-c73ff86ae4bd
Content-Type: application/json

--- request body ---
{"handle":"qa-0a461198c067","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c503102-3f42-45ed-9e2c-c73ff86ae4bd
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ba03bc7-2bc0-41e8-9926-dff243a8aca6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d678849c-6bd1-489f-9c28-9ca4c0b942cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d678849c-6bd1-489f-9c28-9ca4c0b942cd
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d678849c-6bd1-489f-9c28-9ca4c0b942cd
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
correlation: qa-d0ebaa7b-8347-41ac-806a-5b6da63c6ddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ebaa7b-8347-41ac-806a-5b6da63c6ddd
Content-Type: application/json

--- request body ---
{"handle":"qa-0a461198c067","password":"****"}

--- response: 401 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0ebaa7b-8347-41ac-806a-5b6da63c6ddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0ebaa7b-8347-41ac-806a-5b6da63c6ddd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-121b46fb-becf-4638-95ae-a8de3de6e817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-121b46fb-becf-4638-95ae-a8de3de6e817
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-121b46fb-becf-4638-95ae-a8de3de6e817
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
correlation: qa-439edfde-fb43-4f98-ab4b-70e36c29f29d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-439edfde-fb43-4f98-ab4b-70e36c29f29d
Content-Type: application/json

--- request body ---
{"handle":"qa-2e8fcddfcb36","password":"****"}

--- response: 401 in 77 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-439edfde-fb43-4f98-ab4b-70e36c29f29d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-439edfde-fb43-4f98-ab4b-70e36c29f29d"}
```
