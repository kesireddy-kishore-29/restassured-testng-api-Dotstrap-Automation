# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 102 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-2757caee-48ad-4d7b-9878-6513bb527af5` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-672b4e52-e9a4-4f28-b606-68260db7765b` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-7ea0dd3b-e8a6-4d7c-a785-c514b708dac3` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-5c0c3f91-1db0-4ed4-b5ae-b183130ff834` |
| 5 | `GET /v1/accounts/me` | 200 | 22 | `qa-b222da72-f038-47e4-9ce6-4981d7deeea7` |
| 6 | `GET /v1/accounts/me` | 200 | 17 | `qa-390f5cce-ebb6-4270-8889-6cf161e8591e` |
| 7 | `GET /v1/accounts/me` | 200 | 21 | `qa-bc995bc2-689b-43ee-8775-f2196181e518` |
| 8 | `GET /v1/accounts/me` | 200 | 31 | `qa-2a0a0368-e707-431e-8745-c909eaf32fe5` |
| 9 | `GET /v1/accounts/me` | 200 | 36 | `qa-6eacfd6d-e42d-4c3f-b58b-c7639e1258cc` |
| 10 | `GET /v1/accounts/me` | 200 | 26 | `qa-24d22d13-263b-419a-b732-f4c79fd083ca` |
| 11 | `GET /v1/accounts/me` | 200 | 32 | `qa-b5b52289-eaa3-4aab-8b78-8a58ed6dd666` |
| 12 | `GET /v1/accounts/me` | 200 | 16 | `qa-39807e87-6520-448a-bc43-545ee2bcc3b5` |
| 13 | `GET /v1/accounts/me` | 200 | 17 | `qa-7a59afa1-81d6-4a41-bb0f-dd91a4a279ca` |
| 14 | `GET /v1/accounts/me` | 200 | 17 | `qa-e0c114fe-027d-481e-a877-66fe3d135df3` |
| 15 | `GET /v1/accounts/me` | 200 | 27 | `qa-ceae755a-33ed-441f-8a41-c616fb5b47df` |
| 16 | `GET /v1/accounts/me` | 200 | 20 | `qa-d6de13e2-f8b0-4a08-8bf6-439f06f38fa9` |
| 17 | `GET /v1/accounts/me` | 200 | 19 | `qa-ea4e7d1d-a8e8-43ef-b3ce-561bd6364379` |
| 18 | `GET /v1/accounts/me` | 200 | 15 | `qa-d85d28f6-32db-4b37-b97d-8133bed35ba4` |
| 19 | `GET /v1/accounts/me` | 200 | 8 | `qa-18087177-0471-4890-9bc9-9966b8d248fb` |
| 20 | `GET /v1/accounts/me` | 200 | 15 | `qa-914a41fd-7a09-4d03-804a-86a039cc55af` |
| 21 | `GET /v1/accounts/me` | 200 | 15 | `qa-4eec8fb3-a74c-4f3a-b05e-88adafa4f447` |
| 22 | `GET /v1/accounts/me` | 200 | 15 | `qa-0bd2b1af-d63e-4cdb-af30-c0244da43ad7` |
| 23 | `GET /v1/accounts/me` | 200 | 18 | `qa-26a59e95-b750-4bfc-bfa3-73280ccdcfb9` |
| 24 | `GET /v1/accounts/me` | 200 | 31 | `qa-9a1e0920-efe3-4296-aa98-70bb7dcccb50` |
| 25 | `GET /v1/accounts/me` | 200 | 35 | `qa-1e2550cd-70f2-4488-8e7e-88662b40755d` |
| 26 | `GET /v1/accounts/me` | 200 | 18 | `qa-bff8129e-79e5-4aa9-934c-4d11b8ea23fa` |
| 27 | `GET /v1/accounts/me` | 200 | 23 | `qa-a914b221-b6c1-42c8-ab11-fc6f44c2358b` |
| 28 | `GET /v1/accounts/me` | 200 | 23 | `qa-a2640f26-349b-4dec-b68c-214e4bfcfe24` |
| 29 | `GET /v1/accounts/me` | 200 | 25 | `qa-a668b8cc-7935-4f46-9424-ddb8bd9fd982` |
| 30 | `GET /v1/accounts/me` | 200 | 29 | `qa-96eff9b8-73e0-4003-a142-2d06911fe866` |
| 31 | `GET /v1/accounts/me` | 200 | 26 | `qa-b04c6848-aaec-4e6f-acc1-d121f575d73d` |
| 32 | `GET /v1/accounts/me` | 200 | 10 | `qa-7471dc7b-b8ca-4eb6-af5c-e0fd71fff388` |
| 33 | `GET /v1/accounts/me` | 200 | 20 | `qa-6d898f2f-ccd6-463a-b90a-1cba74aada1a` |
| 34 | `GET /v1/accounts/me` | 200 | 14 | `qa-519aa8f8-3999-47be-99b5-bc9776029d96` |
| 35 | `GET /v1/accounts/me` | 200 | 23 | `qa-d8f9afa6-93a8-4ac9-9b85-ad7dbef53609` |
| 36 | `GET /v1/accounts/me` | 200 | 19 | `qa-a7343070-8dcb-4994-a1c8-3943479f1536` |
| 37 | `GET /v1/accounts/me` | 200 | 10 | `qa-63b9e51e-4bc6-44c8-b634-6ec7b7434a6b` |
| 38 | `GET /v1/accounts/me` | 200 | 10 | `qa-f02c3936-4d88-4323-9a5e-8a2b944d35f1` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-7febee3f-2f9a-4d17-95f7-e7115803a2ee` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-18701af3-9872-406e-8b17-eaa9b9ff78b5` |
| 41 | `GET /v1/accounts/me` | 200 | 3 | `qa-a048fcb7-419e-4ee8-81d1-37d7c0eef7e4` |
| 42 | `GET /v1/accounts/me` | 200 | 10 | `qa-6b92c83f-2935-4a73-a4a5-70656f412d79` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-101eb412-fdd9-49be-916c-55f191b3a4b2` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-8bb01c76-9f50-404a-9d6c-cc6f465e8ec9` |
| 45 | `GET /v1/accounts/me` | 200 | 16 | `qa-858d2ae1-b087-4cf4-a5d3-a28791cc67fd` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-78aa8d18-3987-44a8-84ed-66dc39e46efa` |
| 47 | `GET /v1/accounts/me` | 200 | 5 | `qa-a08e12da-217c-4610-ae88-450d160553c6` |
| 48 | `GET /v1/accounts/me` | 200 | 10 | `qa-162ea54d-b811-4f19-86f3-4101b4d5931e` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-451a2cbb-924d-4104-b792-eabf23e17228` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-10d64b91-2dcf-48af-8633-5086452a83e4` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-7b10216d-37a7-443d-956b-98374264b0fd` |
| 52 | `GET /v1/accounts/me` | 200 | 10 | `qa-00982c00-14ab-4b1e-9c83-454563ea9fa1` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-8e0a70e3-01ab-4fd7-807f-c53fff06a08a` |
| 54 | `GET /v1/accounts/me` | 200 | 35 | `qa-5d418fdc-c1cb-4ca6-baf8-3325b61500df` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-bb231a9c-f21d-401c-81bb-9e51accb6c57` |
| 56 | `GET /v1/accounts/me` | 200 | 20 | `qa-0ee9c76f-be60-4079-a938-f19849600855` |
| 57 | `GET /v1/accounts/me` | 200 | 14 | `qa-c6961b99-4b4d-4b64-8c41-3153ebf33049` |
| 58 | `GET /v1/accounts/me` | 200 | 16 | `qa-754b78e8-b861-414c-a369-88acc4d05280` |
| 59 | `GET /v1/accounts/me` | 200 | 10 | `qa-0cc1bf27-e635-48ce-a062-ca19c76bca53` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-a18b9aa0-e54d-4d17-9fcf-ed1195ce3cd6` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-59857b44-394b-4d99-973a-d1da6c4a4efa` |
| 62 | `GET /v1/accounts/me` | 200 | 7 | `qa-57a67f38-f01e-4668-8692-6b5333aa5ed8` |
| 63 | `GET /v1/accounts/me` | 200 | 3 | `qa-77e26878-c2c2-4191-864a-c93a7f79f030` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-8df62f71-ed0d-4393-bf30-77a0bdaeda08` |
| 65 | `POST /v1/auth/token` | 429 | 8 | `qa-cc3294df-93c3-4cb0-818a-8771fd1127c3` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-e7ea427b-e4f7-4b81-a811-5dd04c4a54f1` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-5793d6fb-f880-4889-a891-ad45cbfdcccc` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-a5bb541f-d685-4e72-be85-fe06a0e93118` |
| 69 | `DELETE /v1/accounts/me` | 429 | 7 | `qa-71f7c580-a31b-4a63-b5ef-929c5804b390` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 9 | `qa-a337e8ec-36da-4bb6-a3b0-7f7facf7139e` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-6de81380-70b6-4f21-85fb-43c4b6e73354` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-c76cdd2c-850c-4870-9023-d8582992cbfc` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-eb7b5508-08de-4966-b045-45c53d7ca4b0` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-f71ba9ee-baac-45bb-a4c5-b0ab293b5c64` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-d646deb8-29d0-4045-abf8-cae0e45fe300` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 6 | `qa-7652baee-f4a1-4819-b88c-b7c038b42844` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-4e3ac366-41b6-4088-ad47-20725003fdd9` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-edd08374-a8c9-4c99-8cb7-91803c1e8bee` |
| 79 | `GET /v1/credits/ledger` | 429 | 5 | `qa-416ffab3-aef5-4dbc-a30d-58723871994e` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-afe7d89e-0bb0-40df-8000-90b3ba622c08` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-83c6eb12-81d3-4d20-b1e9-c8dff95f0183` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-2b3276be-f899-4b2f-8965-d8dc93fa5904` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-f5c5de8d-4598-4e29-bc41-bc415da2cef2` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-94f1720a-1154-47bf-8c80-57e6fb447283` |
| 85 | `GET /v1/accounts/me` | 429 | 5 | `qa-dbf89aaf-ee7d-4021-b181-322a5c3bfcc1` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-ee54ef0d-9b3d-4800-b7df-85171846be4a` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-a41c4521-73a9-49da-ae1c-0e8ddace0495` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-928a40d4-57d3-4cc6-8284-5bcf132396d1` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-08b4e71b-a2bb-49d7-a041-972ec4d8c524` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-23189080-5c23-4cf7-a5a8-77c801fa0950` |
| 91 | `GET /v1/accounts/me` | 429 | 5 | `qa-374964fd-4e64-44b3-a3af-1354f16fb969` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-ce632308-640d-4964-aafe-75ef4fb709c7` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-98cd4a54-70a8-4784-a384-cff57ac957dc` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-3d0a328c-8c81-4de9-bdab-92bb543125f9` |
| 95 | `GET /v1/accounts/me` | 429 | 6 | `qa-7303dd6a-d697-458b-9b57-27adf8fc0ed7` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-b326da24-640f-46da-b489-9faf97d2259b` |
| 97 | `GET /v1/accounts/me` | 200 | 5 | `qa-bf41beb4-716b-4eb9-94a8-393188bcf2d9` |
| 98 | `POST /v1/auth/token` | 200 | 9 | `qa-fb9ece4a-e0cf-479c-bd41-1cdc315873cc` |
| 99 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d0adf3db-291b-48df-9214-5d0ba1f6146a` |
| 100 | `POST /v1/auth/token` | 401 | 6 | `qa-55ef42c5-2108-43de-9715-cb5a827b9bf5` |
| 101 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9641fee5-3406-45dd-b4c7-b0558b633dae` |
| 102 | `POST /v1/auth/token` | 401 | 5 | `qa-05524cdc-d37b-49aa-9190-0619701612e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2757caee-48ad-4d7b-9878-6513bb527af5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2757caee-48ad-4d7b-9878-6513bb527af5
Content-Type: application/json

--- request body ---
{"handle":"qa-de209c155034","displayName":"QA de209c155034","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2757caee-48ad-4d7b-9878-6513bb527af5
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
Location: /v1/accounts/qa-de209c155034
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-672b4e52-e9a4-4f28-b606-68260db7765b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672b4e52-e9a4-4f28-b606-68260db7765b
Content-Type: application/json

--- request body ---
{"handle":"qa-9f71a4042ccd","displayName":"QA 9f71a4042ccd","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-672b4e52-e9a4-4f28-b606-68260db7765b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Location: /v1/accounts/qa-9f71a4042ccd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54e5cc65-0207-431a-a107-faa06011557e","handle":"qa-9f71a4042ccd","displayName":"QA 9f71a4042ccd","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.910253936Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7ea0dd3b-e8a6-4d7c-a785-c514b708dac3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ea0dd3b-e8a6-4d7c-a785-c514b708dac3
Content-Type: application/json

--- request body ---
{"handle":"qa-de209c155034","password":"****"}

--- response: 200 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ea0dd3b-e8a6-4d7c-a785-c514b708dac3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5c0c3f91-1db0-4ed4-b5ae-b183130ff834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c0c3f91-1db0-4ed4-b5ae-b183130ff834
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9f71a4042ccd","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c0c3f91-1db0-4ed4-b5ae-b183130ff834
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
Location: /v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17","subject":"Error contract","status":"open","region":"eu","participants":["qa-de209c155034","qa-9f71a4042ccd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.014810703Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b222da72-f038-47e4-9ce6-4981d7deeea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b222da72-f038-47e4-9ce6-4981d7deeea7
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b222da72-f038-47e4-9ce6-4981d7deeea7
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-390f5cce-ebb6-4270-8889-6cf161e8591e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-390f5cce-ebb6-4270-8889-6cf161e8591e
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-390f5cce-ebb6-4270-8889-6cf161e8591e
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc995bc2-689b-43ee-8775-f2196181e518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc995bc2-689b-43ee-8775-f2196181e518
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc995bc2-689b-43ee-8775-f2196181e518
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a0a0368-e707-431e-8745-c909eaf32fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a0a0368-e707-431e-8745-c909eaf32fe5
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a0a0368-e707-431e-8745-c909eaf32fe5
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eacfd6d-e42d-4c3f-b58b-c7639e1258cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eacfd6d-e42d-4c3f-b58b-c7639e1258cc
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eacfd6d-e42d-4c3f-b58b-c7639e1258cc
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-24d22d13-263b-419a-b732-f4c79fd083ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24d22d13-263b-419a-b732-f4c79fd083ca
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-24d22d13-263b-419a-b732-f4c79fd083ca
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5b52289-eaa3-4aab-8b78-8a58ed6dd666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5b52289-eaa3-4aab-8b78-8a58ed6dd666
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5b52289-eaa3-4aab-8b78-8a58ed6dd666
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-39807e87-6520-448a-bc43-545ee2bcc3b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39807e87-6520-448a-bc43-545ee2bcc3b5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-39807e87-6520-448a-bc43-545ee2bcc3b5
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a59afa1-81d6-4a41-bb0f-dd91a4a279ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a59afa1-81d6-4a41-bb0f-dd91a4a279ca
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a59afa1-81d6-4a41-bb0f-dd91a4a279ca
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0c114fe-027d-481e-a877-66fe3d135df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0c114fe-027d-481e-a877-66fe3d135df3
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0c114fe-027d-481e-a877-66fe3d135df3
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-ceae755a-33ed-441f-8a41-c616fb5b47df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceae755a-33ed-441f-8a41-c616fb5b47df
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ceae755a-33ed-441f-8a41-c616fb5b47df
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
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6de13e2-f8b0-4a08-8bf6-439f06f38fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6de13e2-f8b0-4a08-8bf6-439f06f38fa9
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6de13e2-f8b0-4a08-8bf6-439f06f38fa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea4e7d1d-a8e8-43ef-b3ce-561bd6364379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea4e7d1d-a8e8-43ef-b3ce-561bd6364379
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea4e7d1d-a8e8-43ef-b3ce-561bd6364379
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-d85d28f6-32db-4b37-b97d-8133bed35ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d85d28f6-32db-4b37-b97d-8133bed35ba4
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d85d28f6-32db-4b37-b97d-8133bed35ba4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-18087177-0471-4890-9bc9-9966b8d248fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18087177-0471-4890-9bc9-9966b8d248fb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-18087177-0471-4890-9bc9-9966b8d248fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-914a41fd-7a09-4d03-804a-86a039cc55af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-914a41fd-7a09-4d03-804a-86a039cc55af
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-914a41fd-7a09-4d03-804a-86a039cc55af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-4eec8fb3-a74c-4f3a-b05e-88adafa4f447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eec8fb3-a74c-4f3a-b05e-88adafa4f447
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eec8fb3-a74c-4f3a-b05e-88adafa4f447
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bd2b1af-d63e-4cdb-af30-c0244da43ad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bd2b1af-d63e-4cdb-af30-c0244da43ad7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bd2b1af-d63e-4cdb-af30-c0244da43ad7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-26a59e95-b750-4bfc-bfa3-73280ccdcfb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26a59e95-b750-4bfc-bfa3-73280ccdcfb9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-26a59e95-b750-4bfc-bfa3-73280ccdcfb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a1e0920-efe3-4296-aa98-70bb7dcccb50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a1e0920-efe3-4296-aa98-70bb7dcccb50
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a1e0920-efe3-4296-aa98-70bb7dcccb50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e2550cd-70f2-4488-8e7e-88662b40755d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e2550cd-70f2-4488-8e7e-88662b40755d
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e2550cd-70f2-4488-8e7e-88662b40755d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-bff8129e-79e5-4aa9-934c-4d11b8ea23fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff8129e-79e5-4aa9-934c-4d11b8ea23fa
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bff8129e-79e5-4aa9-934c-4d11b8ea23fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-a914b221-b6c1-42c8-ab11-fc6f44c2358b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a914b221-b6c1-42c8-ab11-fc6f44c2358b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a914b221-b6c1-42c8-ab11-fc6f44c2358b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2640f26-349b-4dec-b68c-214e4bfcfe24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2640f26-349b-4dec-b68c-214e4bfcfe24
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2640f26-349b-4dec-b68c-214e4bfcfe24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-a668b8cc-7935-4f46-9424-ddb8bd9fd982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a668b8cc-7935-4f46-9424-ddb8bd9fd982
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a668b8cc-7935-4f46-9424-ddb8bd9fd982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-96eff9b8-73e0-4003-a142-2d06911fe866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96eff9b8-73e0-4003-a142-2d06911fe866
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-96eff9b8-73e0-4003-a142-2d06911fe866
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-b04c6848-aaec-4e6f-acc1-d121f575d73d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b04c6848-aaec-4e6f-acc1-d121f575d73d
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b04c6848-aaec-4e6f-acc1-d121f575d73d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-7471dc7b-b8ca-4eb6-af5c-e0fd71fff388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7471dc7b-b8ca-4eb6-af5c-e0fd71fff388
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-7471dc7b-b8ca-4eb6-af5c-e0fd71fff388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d898f2f-ccd6-463a-b90a-1cba74aada1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d898f2f-ccd6-463a-b90a-1cba74aada1a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d898f2f-ccd6-463a-b90a-1cba74aada1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-519aa8f8-3999-47be-99b5-bc9776029d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-519aa8f8-3999-47be-99b5-bc9776029d96
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-519aa8f8-3999-47be-99b5-bc9776029d96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8f9afa6-93a8-4ac9-9b85-ad7dbef53609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f9afa6-93a8-4ac9-9b85-ad7dbef53609
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8f9afa6-93a8-4ac9-9b85-ad7dbef53609
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7343070-8dcb-4994-a1c8-3943479f1536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7343070-8dcb-4994-a1c8-3943479f1536
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7343070-8dcb-4994-a1c8-3943479f1536
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-63b9e51e-4bc6-44c8-b634-6ec7b7434a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b9e51e-4bc6-44c8-b634-6ec7b7434a6b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-63b9e51e-4bc6-44c8-b634-6ec7b7434a6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-f02c3936-4d88-4323-9a5e-8a2b944d35f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02c3936-4d88-4323-9a5e-8a2b944d35f1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-f02c3936-4d88-4323-9a5e-8a2b944d35f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-7febee3f-2f9a-4d17-95f7-e7115803a2ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7febee3f-2f9a-4d17-95f7-e7115803a2ee
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-7febee3f-2f9a-4d17-95f7-e7115803a2ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-18701af3-9872-406e-8b17-eaa9b9ff78b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18701af3-9872-406e-8b17-eaa9b9ff78b5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-18701af3-9872-406e-8b17-eaa9b9ff78b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-a048fcb7-419e-4ee8-81d1-37d7c0eef7e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a048fcb7-419e-4ee8-81d1-37d7c0eef7e4
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-a048fcb7-419e-4ee8-81d1-37d7c0eef7e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b92c83f-2935-4a73-a4a5-70656f412d79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b92c83f-2935-4a73-a4a5-70656f412d79
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b92c83f-2935-4a73-a4a5-70656f412d79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-101eb412-fdd9-49be-916c-55f191b3a4b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-101eb412-fdd9-49be-916c-55f191b3a4b2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-101eb412-fdd9-49be-916c-55f191b3a4b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bb01c76-9f50-404a-9d6c-cc6f465e8ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bb01c76-9f50-404a-9d6c-cc6f465e8ec9
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bb01c76-9f50-404a-9d6c-cc6f465e8ec9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-858d2ae1-b087-4cf4-a5d3-a28791cc67fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-858d2ae1-b087-4cf4-a5d3-a28791cc67fd
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-858d2ae1-b087-4cf4-a5d3-a28791cc67fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-78aa8d18-3987-44a8-84ed-66dc39e46efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78aa8d18-3987-44a8-84ed-66dc39e46efa
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-78aa8d18-3987-44a8-84ed-66dc39e46efa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-a08e12da-217c-4610-ae88-450d160553c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a08e12da-217c-4610-ae88-450d160553c6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-a08e12da-217c-4610-ae88-450d160553c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-162ea54d-b811-4f19-86f3-4101b4d5931e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-162ea54d-b811-4f19-86f3-4101b4d5931e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-162ea54d-b811-4f19-86f3-4101b4d5931e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-451a2cbb-924d-4104-b792-eabf23e17228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-451a2cbb-924d-4104-b792-eabf23e17228
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-451a2cbb-924d-4104-b792-eabf23e17228
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-10d64b91-2dcf-48af-8633-5086452a83e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d64b91-2dcf-48af-8633-5086452a83e4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-10d64b91-2dcf-48af-8633-5086452a83e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b10216d-37a7-443d-956b-98374264b0fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b10216d-37a7-443d-956b-98374264b0fd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b10216d-37a7-443d-956b-98374264b0fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-00982c00-14ab-4b1e-9c83-454563ea9fa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00982c00-14ab-4b1e-9c83-454563ea9fa1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-00982c00-14ab-4b1e-9c83-454563ea9fa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e0a70e3-01ab-4fd7-807f-c53fff06a08a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e0a70e3-01ab-4fd7-807f-c53fff06a08a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e0a70e3-01ab-4fd7-807f-c53fff06a08a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d418fdc-c1cb-4ca6-baf8-3325b61500df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d418fdc-c1cb-4ca6-baf8-3325b61500df
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d418fdc-c1cb-4ca6-baf8-3325b61500df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb231a9c-f21d-401c-81bb-9e51accb6c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb231a9c-f21d-401c-81bb-9e51accb6c57
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb231a9c-f21d-401c-81bb-9e51accb6c57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ee9c76f-be60-4079-a938-f19849600855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ee9c76f-be60-4079-a938-f19849600855
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ee9c76f-be60-4079-a938-f19849600855
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-c6961b99-4b4d-4b64-8c41-3153ebf33049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6961b99-4b4d-4b64-8c41-3153ebf33049
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6961b99-4b4d-4b64-8c41-3153ebf33049
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-754b78e8-b861-414c-a369-88acc4d05280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-754b78e8-b861-414c-a369-88acc4d05280
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-754b78e8-b861-414c-a369-88acc4d05280
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-0cc1bf27-e635-48ce-a062-ca19c76bca53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc1bf27-e635-48ce-a062-ca19c76bca53
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cc1bf27-e635-48ce-a062-ca19c76bca53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-a18b9aa0-e54d-4d17-9fcf-ed1195ce3cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18b9aa0-e54d-4d17-9fcf-ed1195ce3cd6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-a18b9aa0-e54d-4d17-9fcf-ed1195ce3cd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-59857b44-394b-4d99-973a-d1da6c4a4efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59857b44-394b-4d99-973a-d1da6c4a4efa
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-59857b44-394b-4d99-973a-d1da6c4a4efa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-57a67f38-f01e-4668-8692-6b5333aa5ed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a67f38-f01e-4668-8692-6b5333aa5ed8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-57a67f38-f01e-4668-8692-6b5333aa5ed8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-77e26878-c2c2-4191-864a-c93a7f79f030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e26878-c2c2-4191-864a-c93a7f79f030
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-77e26878-c2c2-4191-864a-c93a7f79f030
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-8df62f71-ed0d-4393-bf30-77a0bdaeda08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8df62f71-ed0d-4393-bf30-77a0bdaeda08
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8df62f71-ed0d-4393-bf30-77a0bdaeda08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8df62f71-ed0d-4393-bf30-77a0bdaeda08"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-cc3294df-93c3-4cb0-818a-8771fd1127c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc3294df-93c3-4cb0-818a-8771fd1127c3
Content-Type: application/json

--- request body ---
{"handle":"qa-de209c155034","password":"****"}

--- response: 429 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc3294df-93c3-4cb0-818a-8771fd1127c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-cc3294df-93c3-4cb0-818a-8771fd1127c3"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-e7ea427b-e4f7-4b81-a811-5dd04c4a54f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7ea427b-e4f7-4b81-a811-5dd04c4a54f1
Content-Type: application/json

--- request body ---
{"handle":"qa-23b452481567","displayName":"QA 23b452481567","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7ea427b-e4f7-4b81-a811-5dd04c4a54f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-e7ea427b-e4f7-4b81-a811-5dd04c4a54f1"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-5793d6fb-f880-4889-a891-ad45cbfdcccc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5793d6fb-f880-4889-a891-ad45cbfdcccc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5793d6fb-f880-4889-a891-ad45cbfdcccc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5793d6fb-f880-4889-a891-ad45cbfdcccc"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a5bb541f-d685-4e72-be85-fe06a0e93118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5bb541f-d685-4e72-be85-fe06a0e93118
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5bb541f-d685-4e72-be85-fe06a0e93118
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a5bb541f-d685-4e72-be85-fe06a0e93118"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71f7c580-a31b-4a63-b5ef-929c5804b390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f7c580-a31b-4a63-b5ef-929c5804b390
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71f7c580-a31b-4a63-b5ef-929c5804b390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-71f7c580-a31b-4a63-b5ef-929c5804b390"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-de209c155034
correlation: qa-a337e8ec-36da-4bb6-a3b0-7f7facf7139e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a337e8ec-36da-4bb6-a3b0-7f7facf7139e
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a337e8ec-36da-4bb6-a3b0-7f7facf7139e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-de209c155034","correlationId":"qa-a337e8ec-36da-4bb6-a3b0-7f7facf7139e"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-6de81380-70b6-4f21-85fb-43c4b6e73354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6de81380-70b6-4f21-85fb-43c4b6e73354
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-de209c155034","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6de81380-70b6-4f21-85fb-43c4b6e73354
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-6de81380-70b6-4f21-85fb-43c4b6e73354"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-c76cdd2c-850c-4870-9023-d8582992cbfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c76cdd2c-850c-4870-9023-d8582992cbfc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c76cdd2c-850c-4870-9023-d8582992cbfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-c76cdd2c-850c-4870-9023-d8582992cbfc"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17
correlation: qa-eb7b5508-08de-4966-b045-45c53d7ca4b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7b5508-08de-4966-b045-45c53d7ca4b0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb7b5508-08de-4966-b045-45c53d7ca4b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17","correlationId":"qa-eb7b5508-08de-4966-b045-45c53d7ca4b0"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/messages
correlation: qa-f71ba9ee-baac-45bb-a4c5-b0ab293b5c64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f71ba9ee-baac-45bb-a4c5-b0ab293b5c64
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f71ba9ee-baac-45bb-a4c5-b0ab293b5c64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/messages","correlationId":"qa-f71ba9ee-baac-45bb-a4c5-b0ab293b5c64"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/messages
correlation: qa-d646deb8-29d0-4045-abf8-cae0e45fe300

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d646deb8-29d0-4045-abf8-cae0e45fe300
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d646deb8-29d0-4045-abf8-cae0e45fe300
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/messages","correlationId":"qa-d646deb8-29d0-4045-abf8-cae0e45fe300"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/read
correlation: qa-7652baee-f4a1-4819-b88c-b7c038b42844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7652baee-f4a1-4819-b88c-b7c038b42844
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7652baee-f4a1-4819-b88c-b7c038b42844
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/read","correlationId":"qa-7652baee-f4a1-4819-b88c-b7c038b42844"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/close
correlation: qa-4e3ac366-41b6-4088-ad47-20725003fdd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e3ac366-41b6-4088-ad47-20725003fdd9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e3ac366-41b6-4088-ad47-20725003fdd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_9b0f262c-0106-4546-8ce5-db7f5c147e17/close","correlationId":"qa-4e3ac366-41b6-4088-ad47-20725003fdd9"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-edd08374-a8c9-4c99-8cb7-91803c1e8bee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edd08374-a8c9-4c99-8cb7-91803c1e8bee
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edd08374-a8c9-4c99-8cb7-91803c1e8bee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-edd08374-a8c9-4c99-8cb7-91803c1e8bee"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-416ffab3-aef5-4dbc-a30d-58723871994e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-416ffab3-aef5-4dbc-a30d-58723871994e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-416ffab3-aef5-4dbc-a30d-58723871994e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-416ffab3-aef5-4dbc-a30d-58723871994e"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-afe7d89e-0bb0-40df-8000-90b3ba622c08

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6960a2a2d5c548c49a42f09a54dfc3e3
X-Correlation-Id: qa-afe7d89e-0bb0-40df-8000-90b3ba622c08
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afe7d89e-0bb0-40df-8000-90b3ba622c08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-afe7d89e-0bb0-40df-8000-90b3ba622c08"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-83c6eb12-81d3-4d20-b1e9-c8dff95f0183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83c6eb12-81d3-4d20-b1e9-c8dff95f0183
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83c6eb12-81d3-4d20-b1e9-c8dff95f0183
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-83c6eb12-81d3-4d20-b1e9-c8dff95f0183"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b3276be-f899-4b2f-8965-d8dc93fa5904

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b3276be-f899-4b2f-8965-d8dc93fa5904
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b3276be-f899-4b2f-8965-d8dc93fa5904
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2b3276be-f899-4b2f-8965-d8dc93fa5904"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5c5de8d-4598-4e29-bc41-bc415da2cef2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5c5de8d-4598-4e29-bc41-bc415da2cef2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5c5de8d-4598-4e29-bc41-bc415da2cef2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f5c5de8d-4598-4e29-bc41-bc415da2cef2"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-94f1720a-1154-47bf-8c80-57e6fb447283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f1720a-1154-47bf-8c80-57e6fb447283
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94f1720a-1154-47bf-8c80-57e6fb447283
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-94f1720a-1154-47bf-8c80-57e6fb447283"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-dbf89aaf-ee7d-4021-b181-322a5c3bfcc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbf89aaf-ee7d-4021-b181-322a5c3bfcc1
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbf89aaf-ee7d-4021-b181-322a5c3bfcc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dbf89aaf-ee7d-4021-b181-322a5c3bfcc1"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee54ef0d-9b3d-4800-b7df-85171846be4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee54ef0d-9b3d-4800-b7df-85171846be4a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee54ef0d-9b3d-4800-b7df-85171846be4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee54ef0d-9b3d-4800-b7df-85171846be4a"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-a41c4521-73a9-49da-ae1c-0e8ddace0495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a41c4521-73a9-49da-ae1c-0e8ddace0495
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a41c4521-73a9-49da-ae1c-0e8ddace0495
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a41c4521-73a9-49da-ae1c-0e8ddace0495"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-928a40d4-57d3-4cc6-8284-5bcf132396d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-928a40d4-57d3-4cc6-8284-5bcf132396d1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-928a40d4-57d3-4cc6-8284-5bcf132396d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-928a40d4-57d3-4cc6-8284-5bcf132396d1"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-08b4e71b-a2bb-49d7-a041-972ec4d8c524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08b4e71b-a2bb-49d7-a041-972ec4d8c524
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08b4e71b-a2bb-49d7-a041-972ec4d8c524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-08b4e71b-a2bb-49d7-a041-972ec4d8c524"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-23189080-5c23-4cf7-a5a8-77c801fa0950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23189080-5c23-4cf7-a5a8-77c801fa0950
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23189080-5c23-4cf7-a5a8-77c801fa0950
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-23189080-5c23-4cf7-a5a8-77c801fa0950"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-374964fd-4e64-44b3-a3af-1354f16fb969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374964fd-4e64-44b3-a3af-1354f16fb969
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-374964fd-4e64-44b3-a3af-1354f16fb969
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-374964fd-4e64-44b3-a3af-1354f16fb969"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce632308-640d-4964-aafe-75ef4fb709c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce632308-640d-4964-aafe-75ef4fb709c7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce632308-640d-4964-aafe-75ef4fb709c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ce632308-640d-4964-aafe-75ef4fb709c7"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-98cd4a54-70a8-4784-a384-cff57ac957dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98cd4a54-70a8-4784-a384-cff57ac957dc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98cd4a54-70a8-4784-a384-cff57ac957dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-98cd4a54-70a8-4784-a384-cff57ac957dc"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d0a328c-8c81-4de9-bdab-92bb543125f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d0a328c-8c81-4de9-bdab-92bb543125f9
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d0a328c-8c81-4de9-bdab-92bb543125f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3d0a328c-8c81-4de9-bdab-92bb543125f9"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-7303dd6a-d697-458b-9b57-27adf8fc0ed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7303dd6a-d697-458b-9b57-27adf8fc0ed7
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7303dd6a-d697-458b-9b57-27adf8fc0ed7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7303dd6a-d697-458b-9b57-27adf8fc0ed7"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-b326da24-640f-46da-b489-9faf97d2259b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b326da24-640f-46da-b489-9faf97d2259b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b326da24-640f-46da-b489-9faf97d2259b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b326da24-640f-46da-b489-9faf97d2259b"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf41beb4-716b-4eb9-94a8-393188bcf2d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf41beb4-716b-4eb9-94a8-393188bcf2d9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf41beb4-716b-4eb9-94a8-393188bcf2d9
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

{"id":"acc_6931a2f4-2e7f-44d3-9cb7-d84264004eac","handle":"qa-de209c155034","displayName":"QA de209c155034","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.871318157Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-fb9ece4a-e0cf-479c-bd41-1cdc315873cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9ece4a-e0cf-479c-bd41-1cdc315873cc
Content-Type: application/json

--- request body ---
{"handle":"qa-9f71a4042ccd","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb9ece4a-e0cf-479c-bd41-1cdc315873cc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54e5cc65-0207-431a-a107-faa06011557e"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0adf3db-291b-48df-9214-5d0ba1f6146a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0adf3db-291b-48df-9214-5d0ba1f6146a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0adf3db-291b-48df-9214-5d0ba1f6146a
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

## 100. POST /v1/auth/token

```text
#100 POST http://localhost:7070/v1/auth/token
correlation: qa-55ef42c5-2108-43de-9715-cb5a827b9bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ef42c5-2108-43de-9715-cb5a827b9bf5
Content-Type: application/json

--- request body ---
{"handle":"qa-9f71a4042ccd","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55ef42c5-2108-43de-9715-cb5a827b9bf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55ef42c5-2108-43de-9715-cb5a827b9bf5"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9641fee5-3406-45dd-b4c7-b0558b633dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9641fee5-3406-45dd-b4c7-b0558b633dae
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 11 Nov 2026 09:34:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9641fee5-3406-45dd-b4c7-b0558b633dae
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

## 102. POST /v1/auth/token

```text
#102 POST http://localhost:7070/v1/auth/token
correlation: qa-05524cdc-d37b-49aa-9190-0619701612e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05524cdc-d37b-49aa-9190-0619701612e0
Content-Type: application/json

--- request body ---
{"handle":"qa-de209c155034","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05524cdc-d37b-49aa-9190-0619701612e0
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05524cdc-d37b-49aa-9190-0619701612e0"}
```
