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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-ed200bf9-d135-47ad-b30b-e55af43ccc80` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-817b4509-7226-42b6-9ac3-0997cce3af8c` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-888880de-c8ec-4acb-9e8e-24eca696e5a0` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-494d935e-a7e9-4541-85ed-9f11441b29d1` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-6725d4df-65f5-4edf-84e1-33ebe6e9fb66` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-a0309b49-6a46-4e06-86c2-06871bf90b56` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 19 | `qa-ecf01e16-d33e-4e48-94f1-e4b1524ade30` |
| 8 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-d7e3dab4-e6e5-4cbc-a828-ac8c31af42c4` |
| 9 | `POST /v1/auth/token` | 401 | 43 | `qa-d9002061-ddd0-4bb6-ab17-ad4eb4f349ce` |
| 10 | `POST /v1/auth/token` | 200 | 69 | `qa-3dcb4bf7-5287-4057-a8fb-b5eb3f43ed45` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-a194de33-d5d7-4e51-8922-6e656bc182cf` |
| 12 | `POST /v1/auth/token` | 401 | 29 | `qa-956fec95-70ca-494d-87ea-ad858f7d33fd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-b789c694-4b08-45cb-900a-4f10e469da02` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-1171af45-fcad-4b17-b50e-25555915a937` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ed200bf9-d135-47ad-b30b-e55af43ccc80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed200bf9-d135-47ad-b30b-e55af43ccc80
Content-Type: application/json

--- request body ---
{"handle":"qa-6b2febe7fdd5","displayName":"QA 6b2febe7fdd5","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed200bf9-d135-47ad-b30b-e55af43ccc80
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
Location: /v1/accounts/qa-6b2febe7fdd5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55693009-654b-47f8-b5a4-062f1a6a65e9","handle":"qa-6b2febe7fdd5","displayName":"QA 6b2febe7fdd5","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.277127416Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-817b4509-7226-42b6-9ac3-0997cce3af8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-817b4509-7226-42b6-9ac3-0997cce3af8c
Content-Type: application/json

--- request body ---
{"handle":"qa-c78139631566","displayName":"QA c78139631566","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-817b4509-7226-42b6-9ac3-0997cce3af8c
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
Location: /v1/accounts/qa-c78139631566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea382883-053c-46f8-ba7d-7cbc8212ec7e","handle":"qa-c78139631566","displayName":"QA c78139631566","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.314852049Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-888880de-c8ec-4acb-9e8e-24eca696e5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-888880de-c8ec-4acb-9e8e-24eca696e5a0
Content-Type: application/json

--- request body ---
{"handle":"qa-52099fbfee7f","displayName":"QA 52099fbfee7f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-888880de-c8ec-4acb-9e8e-24eca696e5a0
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
Location: /v1/accounts/qa-52099fbfee7f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_316d43bb-9772-4cb6-8758-082c2ad71223","handle":"qa-52099fbfee7f","displayName":"QA 52099fbfee7f","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.353946340Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-494d935e-a7e9-4541-85ed-9f11441b29d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-494d935e-a7e9-4541-85ed-9f11441b29d1
Content-Type: application/json

--- request body ---
{"handle":"qa-6b2febe7fdd5","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-494d935e-a7e9-4541-85ed-9f11441b29d1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55693009-654b-47f8-b5a4-062f1a6a65e9"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6725d4df-65f5-4edf-84e1-33ebe6e9fb66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6725d4df-65f5-4edf-84e1-33ebe6e9fb66
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c78139631566","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6725d4df-65f5-4edf-84e1-33ebe6e9fb66
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
Location: /v1/conversations/cnv_838e24ae-792e-4749-a4a4-2d10315b6309
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_838e24ae-792e-4749-a4a4-2d10315b6309","subject":"Error contract","status":"open","region":"eu","participants":["qa-6b2febe7fdd5","qa-c78139631566"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.403198842Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a0309b49-6a46-4e06-86c2-06871bf90b56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0309b49-6a46-4e06-86c2-06871bf90b56
Content-Type: application/json

--- request body ---
{"handle":"qa-52099fbfee7f","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0309b49-6a46-4e06-86c2-06871bf90b56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_316d43bb-9772-4cb6-8758-082c2ad71223"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_838e24ae-792e-4749-a4a4-2d10315b6309/messages
correlation: qa-ecf01e16-d33e-4e48-94f1-e4b1524ade30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecf01e16-d33e-4e48-94f1-e4b1524ade30
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecf01e16-d33e-4e48-94f1-e4b1524ade30
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_838e24ae-792e-4749-a4a4-2d10315b6309/messages","correlationId":"qa-ecf01e16-d33e-4e48-94f1-e4b1524ade30"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7e3dab4-e6e5-4cbc-a828-ac8c31af42c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e3dab4-e6e5-4cbc-a828-ac8c31af42c4
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7e3dab4-e6e5-4cbc-a828-ac8c31af42c4
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
correlation: qa-d9002061-ddd0-4bb6-ab17-ad4eb4f349ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9002061-ddd0-4bb6-ab17-ad4eb4f349ce
Content-Type: application/json

--- request body ---
{"handle":"qa-52099fbfee7f","password":"****"}

--- response: 401 in 43 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9002061-ddd0-4bb6-ab17-ad4eb4f349ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9002061-ddd0-4bb6-ab17-ad4eb4f349ce"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3dcb4bf7-5287-4057-a8fb-b5eb3f43ed45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dcb4bf7-5287-4057-a8fb-b5eb3f43ed45
Content-Type: application/json

--- request body ---
{"handle":"qa-c78139631566","password":"****"}

--- response: 200 in 69 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dcb4bf7-5287-4057-a8fb-b5eb3f43ed45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea382883-053c-46f8-ba7d-7cbc8212ec7e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a194de33-d5d7-4e51-8922-6e656bc182cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a194de33-d5d7-4e51-8922-6e656bc182cf
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a194de33-d5d7-4e51-8922-6e656bc182cf
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
correlation: qa-956fec95-70ca-494d-87ea-ad858f7d33fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-956fec95-70ca-494d-87ea-ad858f7d33fd
Content-Type: application/json

--- request body ---
{"handle":"qa-c78139631566","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-956fec95-70ca-494d-87ea-ad858f7d33fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-956fec95-70ca-494d-87ea-ad858f7d33fd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b789c694-4b08-45cb-900a-4f10e469da02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b789c694-4b08-45cb-900a-4f10e469da02
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b789c694-4b08-45cb-900a-4f10e469da02
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
correlation: qa-1171af45-fcad-4b17-b50e-25555915a937

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1171af45-fcad-4b17-b50e-25555915a937
Content-Type: application/json

--- request body ---
{"handle":"qa-6b2febe7fdd5","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1171af45-fcad-4b17-b50e-25555915a937
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1171af45-fcad-4b17-b50e-25555915a937"}
```
