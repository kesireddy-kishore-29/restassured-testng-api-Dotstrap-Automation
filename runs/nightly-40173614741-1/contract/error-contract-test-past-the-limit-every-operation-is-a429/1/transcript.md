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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-6d694da1-214b-4d84-a88b-9ec3f38baed4` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-1ae1a510-163f-4add-aa19-97e570c2ecac` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-1627d627-e845-4b4a-9816-31a7e03268c8` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-c7540ee1-4081-4bc7-8063-1abbd79bcdb8` |
| 5 | `GET /v1/accounts/me` | 200 | 31 | `qa-eb5caaaf-c7a9-4920-ac30-11b688d243a3` |
| 6 | `GET /v1/accounts/me` | 200 | 13 | `qa-f02f6940-3671-44a3-b53d-55adbe2b250d` |
| 7 | `GET /v1/accounts/me` | 200 | 26 | `qa-3a56eac0-744f-4ee5-9028-4b3bcb8e6d84` |
| 8 | `GET /v1/accounts/me` | 200 | 16 | `qa-4c783eaa-bf66-4de0-94d8-5b67cd7f8cb3` |
| 9 | `GET /v1/accounts/me` | 200 | 15 | `qa-443114c4-20e7-466d-b442-5d80fb841600` |
| 10 | `GET /v1/accounts/me` | 200 | 18 | `qa-fd42f19e-ea74-4fcd-a21e-bb14e1be1cb1` |
| 11 | `GET /v1/accounts/me` | 200 | 20 | `qa-963f77f0-8bd2-4ed3-87c3-d47321b5e43e` |
| 12 | `GET /v1/accounts/me` | 200 | 9 | `qa-d3eb9958-467a-4cda-8344-a11e8e1e2e12` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-eb7a41b9-8d0b-4ad7-a503-e561cbf810c2` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-0f3ec428-9c71-4971-8743-3499206b3f56` |
| 15 | `GET /v1/accounts/me` | 200 | 9 | `qa-2665cfcc-a72d-4f53-ae7e-8c438fcaf719` |
| 16 | `GET /v1/accounts/me` | 200 | 13 | `qa-be1a0131-e524-469f-b10f-0c1d9898c037` |
| 17 | `GET /v1/accounts/me` | 200 | 9 | `qa-2340049a-c7d7-4702-9605-80007a210025` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-3194f57e-9906-417b-8012-16a5ee4cdc10` |
| 19 | `GET /v1/accounts/me` | 200 | 14 | `qa-67eb7489-d471-4e7f-85b6-cd930b2c24f4` |
| 20 | `GET /v1/accounts/me` | 200 | 14 | `qa-8eb25448-34d3-4c79-91fa-c54a59afe85c` |
| 21 | `GET /v1/accounts/me` | 200 | 9 | `qa-66f4a206-c2cc-4cf5-878a-c6ca6120ba9a` |
| 22 | `GET /v1/accounts/me` | 200 | 26 | `qa-770853f6-1ac4-4b25-99be-bd98cbdc5070` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-ffc6ed02-4b65-4950-8d4a-92fe8a0dd307` |
| 24 | `GET /v1/accounts/me` | 200 | 94 | `qa-629c2056-f751-48ad-b0db-29a4161d06b2` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-53c3a252-ed1a-408f-8008-46bded5ffdfb` |
| 26 | `GET /v1/accounts/me` | 200 | 27 | `qa-d5a5ea21-9fa0-4386-8ea7-04aa624ec946` |
| 27 | `GET /v1/accounts/me` | 200 | 14 | `qa-f10c0308-3037-4a69-824e-9c590ee401b2` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-59aa84a4-017f-4d7e-98d2-d17bf301d5d1` |
| 29 | `GET /v1/accounts/me` | 200 | 31 | `qa-c862c85d-7276-4391-9e6e-46c4974ae96f` |
| 30 | `GET /v1/accounts/me` | 200 | 23 | `qa-fd4225b0-abde-4794-a839-d9c0009575a4` |
| 31 | `GET /v1/accounts/me` | 200 | 26 | `qa-6df25bf4-adc0-46de-98a1-c0de80137632` |
| 32 | `GET /v1/accounts/me` | 200 | 13 | `qa-e60ba049-fe9d-41fa-ac3f-13949422462f` |
| 33 | `GET /v1/accounts/me` | 200 | 15 | `qa-605f13ff-91bc-4de1-8a08-7cb0a4d689e8` |
| 34 | `GET /v1/accounts/me` | 200 | 8 | `qa-d30ce65a-6e06-4002-b958-5c3f70dc1ea4` |
| 35 | `GET /v1/accounts/me` | 200 | 7 | `qa-795a6c62-4967-4b2d-953c-0d206743adfe` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-bb136089-cb37-4265-a84b-ec113222c7b3` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-c07cfa99-559a-430c-a439-fd3645d0dc57` |
| 38 | `GET /v1/accounts/me` | 200 | 25 | `qa-8f5c21cc-2bd8-4af0-8646-d8ac1dcdb43b` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-b456fc55-3f0e-4731-babd-d5fb6ae7e32d` |
| 40 | `GET /v1/accounts/me` | 200 | 18 | `qa-bbb5d887-33c2-4ebb-a29b-c6cb97952d69` |
| 41 | `GET /v1/accounts/me` | 200 | 32 | `qa-4d9ffd62-c9df-4f42-8467-81b7d33581a6` |
| 42 | `GET /v1/accounts/me` | 200 | 22 | `qa-98f387d9-c67b-4daa-97f0-487023fbaa61` |
| 43 | `GET /v1/accounts/me` | 200 | 20 | `qa-ca4fdc85-b1e0-44be-9d85-946880946c36` |
| 44 | `GET /v1/accounts/me` | 200 | 12 | `qa-f4c7144e-2908-4597-ab24-1845225a08da` |
| 45 | `GET /v1/accounts/me` | 200 | 14 | `qa-7401a055-d11e-4b5d-a4fa-53cd71be4819` |
| 46 | `GET /v1/accounts/me` | 200 | 17 | `qa-f3bfb173-4c8f-4b0b-b8ce-1c798e5b648c` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-27b2c88f-cb2d-496b-95c0-ebccb0718337` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-f64d1d9c-45d4-42c6-8f49-a7a023cb43a6` |
| 49 | `GET /v1/accounts/me` | 200 | 10 | `qa-dd56fb82-e27c-4714-acd1-93eed07060a6` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-40315f02-9a58-49aa-9f81-5c33d2ebb1cb` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-2adfd473-bdd2-4d24-b337-70cd42864fba` |
| 52 | `GET /v1/accounts/me` | 200 | 8 | `qa-c08c6416-b544-4281-909e-126f453a6be7` |
| 53 | `GET /v1/accounts/me` | 200 | 10 | `qa-b2824033-f6be-48d9-b45a-da5241a669d3` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-4493425c-12a7-4fa9-ae79-c12fe5e6fe18` |
| 55 | `GET /v1/accounts/me` | 200 | 12 | `qa-7e1f852c-57b4-431c-a895-d06585df8201` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-e20a3722-bb7e-4b51-9fab-008f77e24a6b` |
| 57 | `GET /v1/accounts/me` | 200 | 16 | `qa-b24a9c65-0f72-4175-8283-da63fd7a8fd0` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-565303e1-c8b8-4ca7-9fcc-a9eb3b865559` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-e9b9d131-bfe8-4146-885a-4af99250fb23` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-d8ee4c8f-4863-45c9-83da-b3af4a4f632b` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-d5687469-570e-46f2-b72f-3caf286e9cd0` |
| 62 | `GET /v1/accounts/me` | 200 | 12 | `qa-b067c971-b71d-4503-82d0-6b379cb34a63` |
| 63 | `GET /v1/accounts/me` | 200 | 16 | `qa-0eab056d-c994-4193-8ffe-012842bc8b98` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-c255bdf9-8ad6-41d3-8f51-efb28af97685` |
| 65 | `POST /v1/auth/token` | 429 | 18 | `qa-8c31096c-7901-41c8-8a35-1ac277fd8b65` |
| 66 | `POST /v1/accounts` | 429 | 11 | `qa-f9462131-c5c5-45ef-92c5-afd482bdb739` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-bc71307d-2bfa-4296-8c59-968070985067` |
| 68 | `PATCH /v1/accounts/me` | 429 | 7 | `qa-511d30b9-214f-4840-96da-831274d101fb` |
| 69 | `DELETE /v1/accounts/me` | 429 | 15 | `qa-ce0bcce0-87d3-4c30-92b4-2ddbfeaa9ac3` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 10 | `qa-c43d935b-043b-46b6-8b5a-61d9ee5768bb` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-edf971c3-07a8-48cd-835b-4b7914a35045` |
| 72 | `GET /v1/conversations` | 429 | 6 | `qa-493d4142-bf30-4194-b114-6b6dc20d33c7` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-a23bd371-c5a9-4ca3-8c4c-b36633b92dff` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-306ffc94-eea7-45d7-917f-137f8993994d` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-bb07c463-846e-4e94-a40b-879d92357b0a` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-074351e3-f97a-451d-9054-116cb128cfe2` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-039c1bce-cb44-463f-ad39-63ef713f3606` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-822f5ddd-6537-48ae-a933-b87081c9327b` |
| 79 | `GET /v1/credits/ledger` | 429 | 5 | `qa-ff1b967a-c552-4d5f-9776-334729cf5e0b` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-eac73620-edb4-4697-bb72-2cb24043ec05` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-e81ba5c0-aa50-4512-8026-22f888cc66e8` |
| 82 | `GET /v1/accounts/me` | 429 | 5 | `qa-a0ae9b83-17c5-456c-86cf-58b8099a2f34` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-dfc81905-685c-4155-ac63-b52c6511ed3c` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-1e3d27b3-1ff0-4ce1-83ae-a9fb6578b53d` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-1cc240e8-13b6-42ac-a4cf-2a56dc57ca39` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-1399c6cf-640b-4ed9-890b-a0ef38e6fa3c` |
| 87 | `GET /v1/accounts/me` | 429 | 4 | `qa-1cfaa634-060c-4f22-ba20-2629e1563d81` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-6792fd0d-fbec-4279-a20b-1bf6cba77bfc` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-4d5254df-e731-4a6a-bd40-7ec91e97a387` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-4da172fb-5e04-4a7f-8181-3495f72be133` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-eb65445f-6b2f-4260-9627-a5282e2d6d66` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-2d184a14-1edd-4a88-b418-17fa65635686` |
| 93 | `GET /v1/accounts/me` | 429 | 5 | `qa-cb01bc02-421f-4ed7-847e-b273ee63f22d` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-4a83b36a-f860-42f7-983a-0966e5231809` |
| 95 | `GET /v1/accounts/me` | 429 | 6 | `qa-ffff82d2-7bdb-4798-bf6c-2230b2ab7a01` |
| 96 | `GET /v1/accounts/me` | 429 | 6 | `qa-616f63e8-9aac-4387-8b99-e3e080707baf` |
| 97 | `GET /v1/accounts/me` | 200 | 10 | `qa-8a21499c-3d39-48e9-b36a-bf2d4e853b24` |
| 98 | `POST /v1/auth/token` | 200 | 11 | `qa-4108a5ef-0b1c-400d-830c-d0dcd41e72c6` |
| 99 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0895f47d-0ed9-4f27-8534-73c552a74ad9` |
| 100 | `POST /v1/auth/token` | 401 | 6 | `qa-6b6f22f0-6a5c-4283-8406-c67258133cb7` |
| 101 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-960f5336-c1f7-481d-ac12-c40ecd096c2c` |
| 102 | `POST /v1/auth/token` | 401 | 4 | `qa-106b9405-08ba-4576-86d3-6af63a8e3e7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d694da1-214b-4d84-a88b-9ec3f38baed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d694da1-214b-4d84-a88b-9ec3f38baed4
Content-Type: application/json

--- request body ---
{"handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d694da1-214b-4d84-a88b-9ec3f38baed4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Location: /v1/accounts/qa-fa3b3d83275b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1ae1a510-163f-4add-aa19-97e570c2ecac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae1a510-163f-4add-aa19-97e570c2ecac
Content-Type: application/json

--- request body ---
{"handle":"qa-5f553f17f138","displayName":"QA 5f553f17f138","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ae1a510-163f-4add-aa19-97e570c2ecac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Location: /v1/accounts/qa-5f553f17f138
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f32cd27-31b2-4276-b4d7-73e8d6726570","handle":"qa-5f553f17f138","displayName":"QA 5f553f17f138","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.850286125Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1627d627-e845-4b4a-9816-31a7e03268c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1627d627-e845-4b4a-9816-31a7e03268c8
Content-Type: application/json

--- request body ---
{"handle":"qa-fa3b3d83275b","password":"****"}

--- response: 200 in 50 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1627d627-e845-4b4a-9816-31a7e03268c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c7540ee1-4081-4bc7-8063-1abbd79bcdb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7540ee1-4081-4bc7-8063-1abbd79bcdb8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5f553f17f138","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7540ee1-4081-4bc7-8063-1abbd79bcdb8
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
Location: /v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_774c8d5b-db08-43f3-9860-c4554e84d603","subject":"Error contract","status":"open","region":"eu","participants":["qa-fa3b3d83275b","qa-5f553f17f138"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.971889821Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb5caaaf-c7a9-4920-ac30-11b688d243a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb5caaaf-c7a9-4920-ac30-11b688d243a3
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb5caaaf-c7a9-4920-ac30-11b688d243a3
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-f02f6940-3671-44a3-b53d-55adbe2b250d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02f6940-3671-44a3-b53d-55adbe2b250d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f02f6940-3671-44a3-b53d-55adbe2b250d
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a56eac0-744f-4ee5-9028-4b3bcb8e6d84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a56eac0-744f-4ee5-9028-4b3bcb8e6d84
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a56eac0-744f-4ee5-9028-4b3bcb8e6d84
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c783eaa-bf66-4de0-94d8-5b67cd7f8cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c783eaa-bf66-4de0-94d8-5b67cd7f8cb3
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c783eaa-bf66-4de0-94d8-5b67cd7f8cb3
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-443114c4-20e7-466d-b442-5d80fb841600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443114c4-20e7-466d-b442-5d80fb841600
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-443114c4-20e7-466d-b442-5d80fb841600
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd42f19e-ea74-4fcd-a21e-bb14e1be1cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd42f19e-ea74-4fcd-a21e-bb14e1be1cb1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd42f19e-ea74-4fcd-a21e-bb14e1be1cb1
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-963f77f0-8bd2-4ed3-87c3-d47321b5e43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963f77f0-8bd2-4ed3-87c3-d47321b5e43e
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-963f77f0-8bd2-4ed3-87c3-d47321b5e43e
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3eb9958-467a-4cda-8344-a11e8e1e2e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3eb9958-467a-4cda-8344-a11e8e1e2e12
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3eb9958-467a-4cda-8344-a11e8e1e2e12
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb7a41b9-8d0b-4ad7-a503-e561cbf810c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7a41b9-8d0b-4ad7-a503-e561cbf810c2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb7a41b9-8d0b-4ad7-a503-e561cbf810c2
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f3ec428-9c71-4971-8743-3499206b3f56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3ec428-9c71-4971-8743-3499206b3f56
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f3ec428-9c71-4971-8743-3499206b3f56
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-2665cfcc-a72d-4f53-ae7e-8c438fcaf719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2665cfcc-a72d-4f53-ae7e-8c438fcaf719
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2665cfcc-a72d-4f53-ae7e-8c438fcaf719
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-be1a0131-e524-469f-b10f-0c1d9898c037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be1a0131-e524-469f-b10f-0c1d9898c037
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-be1a0131-e524-469f-b10f-0c1d9898c037
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-2340049a-c7d7-4702-9605-80007a210025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2340049a-c7d7-4702-9605-80007a210025
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2340049a-c7d7-4702-9605-80007a210025
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-3194f57e-9906-417b-8012-16a5ee4cdc10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3194f57e-9906-417b-8012-16a5ee4cdc10
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3194f57e-9906-417b-8012-16a5ee4cdc10
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-67eb7489-d471-4e7f-85b6-cd930b2c24f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67eb7489-d471-4e7f-85b6-cd930b2c24f4
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-67eb7489-d471-4e7f-85b6-cd930b2c24f4
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-8eb25448-34d3-4c79-91fa-c54a59afe85c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eb25448-34d3-4c79-91fa-c54a59afe85c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8eb25448-34d3-4c79-91fa-c54a59afe85c
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-66f4a206-c2cc-4cf5-878a-c6ca6120ba9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f4a206-c2cc-4cf5-878a-c6ca6120ba9a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-66f4a206-c2cc-4cf5-878a-c6ca6120ba9a
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-770853f6-1ac4-4b25-99be-bd98cbdc5070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-770853f6-1ac4-4b25-99be-bd98cbdc5070
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-770853f6-1ac4-4b25-99be-bd98cbdc5070
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffc6ed02-4b65-4950-8d4a-92fe8a0dd307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffc6ed02-4b65-4950-8d4a-92fe8a0dd307
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffc6ed02-4b65-4950-8d4a-92fe8a0dd307
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-629c2056-f751-48ad-b0db-29a4161d06b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-629c2056-f751-48ad-b0db-29a4161d06b2
Content-Type: application/json

--- response: 200 in 94 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-629c2056-f751-48ad-b0db-29a4161d06b2
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-53c3a252-ed1a-408f-8008-46bded5ffdfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53c3a252-ed1a-408f-8008-46bded5ffdfb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-53c3a252-ed1a-408f-8008-46bded5ffdfb
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5a5ea21-9fa0-4386-8ea7-04aa624ec946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a5ea21-9fa0-4386-8ea7-04aa624ec946
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5a5ea21-9fa0-4386-8ea7-04aa624ec946
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-f10c0308-3037-4a69-824e-9c590ee401b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f10c0308-3037-4a69-824e-9c590ee401b2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f10c0308-3037-4a69-824e-9c590ee401b2
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-59aa84a4-017f-4d7e-98d2-d17bf301d5d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59aa84a4-017f-4d7e-98d2-d17bf301d5d1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-59aa84a4-017f-4d7e-98d2-d17bf301d5d1
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-c862c85d-7276-4391-9e6e-46c4974ae96f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c862c85d-7276-4391-9e6e-46c4974ae96f
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c862c85d-7276-4391-9e6e-46c4974ae96f
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd4225b0-abde-4794-a839-d9c0009575a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd4225b0-abde-4794-a839-d9c0009575a4
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd4225b0-abde-4794-a839-d9c0009575a4
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-6df25bf4-adc0-46de-98a1-c0de80137632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6df25bf4-adc0-46de-98a1-c0de80137632
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6df25bf4-adc0-46de-98a1-c0de80137632
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-e60ba049-fe9d-41fa-ac3f-13949422462f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e60ba049-fe9d-41fa-ac3f-13949422462f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e60ba049-fe9d-41fa-ac3f-13949422462f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-605f13ff-91bc-4de1-8a08-7cb0a4d689e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-605f13ff-91bc-4de1-8a08-7cb0a4d689e8
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-605f13ff-91bc-4de1-8a08-7cb0a4d689e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-d30ce65a-6e06-4002-b958-5c3f70dc1ea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d30ce65a-6e06-4002-b958-5c3f70dc1ea4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d30ce65a-6e06-4002-b958-5c3f70dc1ea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-795a6c62-4967-4b2d-953c-0d206743adfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795a6c62-4967-4b2d-953c-0d206743adfe
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-795a6c62-4967-4b2d-953c-0d206743adfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb136089-cb37-4265-a84b-ec113222c7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb136089-cb37-4265-a84b-ec113222c7b3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb136089-cb37-4265-a84b-ec113222c7b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-c07cfa99-559a-430c-a439-fd3645d0dc57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c07cfa99-559a-430c-a439-fd3645d0dc57
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c07cfa99-559a-430c-a439-fd3645d0dc57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f5c21cc-2bd8-4af0-8646-d8ac1dcdb43b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f5c21cc-2bd8-4af0-8646-d8ac1dcdb43b
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f5c21cc-2bd8-4af0-8646-d8ac1dcdb43b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-b456fc55-3f0e-4731-babd-d5fb6ae7e32d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b456fc55-3f0e-4731-babd-d5fb6ae7e32d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b456fc55-3f0e-4731-babd-d5fb6ae7e32d
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbb5d887-33c2-4ebb-a29b-c6cb97952d69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb5d887-33c2-4ebb-a29b-c6cb97952d69
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbb5d887-33c2-4ebb-a29b-c6cb97952d69
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d9ffd62-c9df-4f42-8467-81b7d33581a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d9ffd62-c9df-4f42-8467-81b7d33581a6
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d9ffd62-c9df-4f42-8467-81b7d33581a6
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-98f387d9-c67b-4daa-97f0-487023fbaa61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98f387d9-c67b-4daa-97f0-487023fbaa61
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f387d9-c67b-4daa-97f0-487023fbaa61
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca4fdc85-b1e0-44be-9d85-946880946c36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca4fdc85-b1e0-44be-9d85-946880946c36
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca4fdc85-b1e0-44be-9d85-946880946c36
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4c7144e-2908-4597-ab24-1845225a08da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4c7144e-2908-4597-ab24-1845225a08da
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4c7144e-2908-4597-ab24-1845225a08da
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-7401a055-d11e-4b5d-a4fa-53cd71be4819

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7401a055-d11e-4b5d-a4fa-53cd71be4819
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7401a055-d11e-4b5d-a4fa-53cd71be4819
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3bfb173-4c8f-4b0b-b8ce-1c798e5b648c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3bfb173-4c8f-4b0b-b8ce-1c798e5b648c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3bfb173-4c8f-4b0b-b8ce-1c798e5b648c
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-27b2c88f-cb2d-496b-95c0-ebccb0718337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b2c88f-cb2d-496b-95c0-ebccb0718337
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-27b2c88f-cb2d-496b-95c0-ebccb0718337
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f64d1d9c-45d4-42c6-8f49-a7a023cb43a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f64d1d9c-45d4-42c6-8f49-a7a023cb43a6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f64d1d9c-45d4-42c6-8f49-a7a023cb43a6
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd56fb82-e27c-4714-acd1-93eed07060a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd56fb82-e27c-4714-acd1-93eed07060a6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd56fb82-e27c-4714-acd1-93eed07060a6
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-40315f02-9a58-49aa-9f81-5c33d2ebb1cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40315f02-9a58-49aa-9f81-5c33d2ebb1cb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-40315f02-9a58-49aa-9f81-5c33d2ebb1cb
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-2adfd473-bdd2-4d24-b337-70cd42864fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2adfd473-bdd2-4d24-b337-70cd42864fba
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2adfd473-bdd2-4d24-b337-70cd42864fba
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-c08c6416-b544-4281-909e-126f453a6be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c08c6416-b544-4281-909e-126f453a6be7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c08c6416-b544-4281-909e-126f453a6be7
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2824033-f6be-48d9-b45a-da5241a669d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2824033-f6be-48d9-b45a-da5241a669d3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2824033-f6be-48d9-b45a-da5241a669d3
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-4493425c-12a7-4fa9-ae79-c12fe5e6fe18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4493425c-12a7-4fa9-ae79-c12fe5e6fe18
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-4493425c-12a7-4fa9-ae79-c12fe5e6fe18
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e1f852c-57b4-431c-a895-d06585df8201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e1f852c-57b4-431c-a895-d06585df8201
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e1f852c-57b4-431c-a895-d06585df8201
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-e20a3722-bb7e-4b51-9fab-008f77e24a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e20a3722-bb7e-4b51-9fab-008f77e24a6b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e20a3722-bb7e-4b51-9fab-008f77e24a6b
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-b24a9c65-0f72-4175-8283-da63fd7a8fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b24a9c65-0f72-4175-8283-da63fd7a8fd0
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b24a9c65-0f72-4175-8283-da63fd7a8fd0
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-565303e1-c8b8-4ca7-9fcc-a9eb3b865559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-565303e1-c8b8-4ca7-9fcc-a9eb3b865559
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-565303e1-c8b8-4ca7-9fcc-a9eb3b865559
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9b9d131-bfe8-4146-885a-4af99250fb23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9b9d131-bfe8-4146-885a-4af99250fb23
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9b9d131-bfe8-4146-885a-4af99250fb23
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8ee4c8f-4863-45c9-83da-b3af4a4f632b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8ee4c8f-4863-45c9-83da-b3af4a4f632b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8ee4c8f-4863-45c9-83da-b3af4a4f632b
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5687469-570e-46f2-b72f-3caf286e9cd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5687469-570e-46f2-b72f-3caf286e9cd0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5687469-570e-46f2-b72f-3caf286e9cd0
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-b067c971-b71d-4503-82d0-6b379cb34a63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b067c971-b71d-4503-82d0-6b379cb34a63
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b067c971-b71d-4503-82d0-6b379cb34a63
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-0eab056d-c994-4193-8ffe-012842bc8b98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eab056d-c994-4193-8ffe-012842bc8b98
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eab056d-c994-4193-8ffe-012842bc8b98
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-c255bdf9-8ad6-41d3-8f51-efb28af97685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c255bdf9-8ad6-41d3-8f51-efb28af97685
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c255bdf9-8ad6-41d3-8f51-efb28af97685
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c255bdf9-8ad6-41d3-8f51-efb28af97685"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-8c31096c-7901-41c8-8a35-1ac277fd8b65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c31096c-7901-41c8-8a35-1ac277fd8b65
Content-Type: application/json

--- request body ---
{"handle":"qa-fa3b3d83275b","password":"****"}

--- response: 429 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c31096c-7901-41c8-8a35-1ac277fd8b65
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-8c31096c-7901-41c8-8a35-1ac277fd8b65"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-f9462131-c5c5-45ef-92c5-afd482bdb739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9462131-c5c5-45ef-92c5-afd482bdb739
Content-Type: application/json

--- request body ---
{"handle":"qa-8d78a83df75d","displayName":"QA 8d78a83df75d","password":"****","region":"eu"}

--- response: 429 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9462131-c5c5-45ef-92c5-afd482bdb739
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-f9462131-c5c5-45ef-92c5-afd482bdb739"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc71307d-2bfa-4296-8c59-968070985067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc71307d-2bfa-4296-8c59-968070985067
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc71307d-2bfa-4296-8c59-968070985067
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bc71307d-2bfa-4296-8c59-968070985067"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-511d30b9-214f-4840-96da-831274d101fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-511d30b9-214f-4840-96da-831274d101fb
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-511d30b9-214f-4840-96da-831274d101fb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-511d30b9-214f-4840-96da-831274d101fb"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce0bcce0-87d3-4c30-92b4-2ddbfeaa9ac3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0bcce0-87d3-4c30-92b4-2ddbfeaa9ac3
Content-Type: application/json

--- response: 429 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce0bcce0-87d3-4c30-92b4-2ddbfeaa9ac3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ce0bcce0-87d3-4c30-92b4-2ddbfeaa9ac3"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-fa3b3d83275b
correlation: qa-c43d935b-043b-46b6-8b5a-61d9ee5768bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c43d935b-043b-46b6-8b5a-61d9ee5768bb
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c43d935b-043b-46b6-8b5a-61d9ee5768bb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-fa3b3d83275b","correlationId":"qa-c43d935b-043b-46b6-8b5a-61d9ee5768bb"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-edf971c3-07a8-48cd-835b-4b7914a35045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edf971c3-07a8-48cd-835b-4b7914a35045
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fa3b3d83275b","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edf971c3-07a8-48cd-835b-4b7914a35045
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-edf971c3-07a8-48cd-835b-4b7914a35045"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-493d4142-bf30-4194-b114-6b6dc20d33c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-493d4142-bf30-4194-b114-6b6dc20d33c7
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-493d4142-bf30-4194-b114-6b6dc20d33c7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-493d4142-bf30-4194-b114-6b6dc20d33c7"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603
correlation: qa-a23bd371-c5a9-4ca3-8c4c-b36633b92dff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a23bd371-c5a9-4ca3-8c4c-b36633b92dff
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a23bd371-c5a9-4ca3-8c4c-b36633b92dff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603","correlationId":"qa-a23bd371-c5a9-4ca3-8c4c-b36633b92dff"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/messages
correlation: qa-306ffc94-eea7-45d7-917f-137f8993994d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-306ffc94-eea7-45d7-917f-137f8993994d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-306ffc94-eea7-45d7-917f-137f8993994d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/messages","correlationId":"qa-306ffc94-eea7-45d7-917f-137f8993994d"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/messages
correlation: qa-bb07c463-846e-4e94-a40b-879d92357b0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb07c463-846e-4e94-a40b-879d92357b0a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb07c463-846e-4e94-a40b-879d92357b0a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/messages","correlationId":"qa-bb07c463-846e-4e94-a40b-879d92357b0a"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/read
correlation: qa-074351e3-f97a-451d-9054-116cb128cfe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074351e3-f97a-451d-9054-116cb128cfe2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-074351e3-f97a-451d-9054-116cb128cfe2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/read","correlationId":"qa-074351e3-f97a-451d-9054-116cb128cfe2"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/close
correlation: qa-039c1bce-cb44-463f-ad39-63ef713f3606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-039c1bce-cb44-463f-ad39-63ef713f3606
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-039c1bce-cb44-463f-ad39-63ef713f3606
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_774c8d5b-db08-43f3-9860-c4554e84d603/close","correlationId":"qa-039c1bce-cb44-463f-ad39-63ef713f3606"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-822f5ddd-6537-48ae-a933-b87081c9327b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-822f5ddd-6537-48ae-a933-b87081c9327b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-822f5ddd-6537-48ae-a933-b87081c9327b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-822f5ddd-6537-48ae-a933-b87081c9327b"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ff1b967a-c552-4d5f-9776-334729cf5e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1b967a-c552-4d5f-9776-334729cf5e0b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff1b967a-c552-4d5f-9776-334729cf5e0b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-ff1b967a-c552-4d5f-9776-334729cf5e0b"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-eac73620-edb4-4697-bb72-2cb24043ec05

--- request headers ---
Accept: application/json
Idempotency-Key: qa-985b4b0de8f24ca29d2e4ecbf56f41e1
X-Correlation-Id: qa-eac73620-edb4-4697-bb72-2cb24043ec05
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eac73620-edb4-4697-bb72-2cb24043ec05
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-eac73620-edb4-4697-bb72-2cb24043ec05"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-e81ba5c0-aa50-4512-8026-22f888cc66e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e81ba5c0-aa50-4512-8026-22f888cc66e8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e81ba5c0-aa50-4512-8026-22f888cc66e8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-e81ba5c0-aa50-4512-8026-22f888cc66e8"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0ae9b83-17c5-456c-86cf-58b8099a2f34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0ae9b83-17c5-456c-86cf-58b8099a2f34
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0ae9b83-17c5-456c-86cf-58b8099a2f34
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a0ae9b83-17c5-456c-86cf-58b8099a2f34"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfc81905-685c-4155-ac63-b52c6511ed3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfc81905-685c-4155-ac63-b52c6511ed3c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfc81905-685c-4155-ac63-b52c6511ed3c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dfc81905-685c-4155-ac63-b52c6511ed3c"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e3d27b3-1ff0-4ce1-83ae-a9fb6578b53d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3d27b3-1ff0-4ce1-83ae-a9fb6578b53d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e3d27b3-1ff0-4ce1-83ae-a9fb6578b53d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1e3d27b3-1ff0-4ce1-83ae-a9fb6578b53d"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cc240e8-13b6-42ac-a4cf-2a56dc57ca39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cc240e8-13b6-42ac-a4cf-2a56dc57ca39
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cc240e8-13b6-42ac-a4cf-2a56dc57ca39
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1cc240e8-13b6-42ac-a4cf-2a56dc57ca39"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-1399c6cf-640b-4ed9-890b-a0ef38e6fa3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1399c6cf-640b-4ed9-890b-a0ef38e6fa3c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1399c6cf-640b-4ed9-890b-a0ef38e6fa3c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1399c6cf-640b-4ed9-890b-a0ef38e6fa3c"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cfaa634-060c-4f22-ba20-2629e1563d81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cfaa634-060c-4f22-ba20-2629e1563d81
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cfaa634-060c-4f22-ba20-2629e1563d81
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1cfaa634-060c-4f22-ba20-2629e1563d81"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-6792fd0d-fbec-4279-a20b-1bf6cba77bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6792fd0d-fbec-4279-a20b-1bf6cba77bfc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6792fd0d-fbec-4279-a20b-1bf6cba77bfc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6792fd0d-fbec-4279-a20b-1bf6cba77bfc"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d5254df-e731-4a6a-bd40-7ec91e97a387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d5254df-e731-4a6a-bd40-7ec91e97a387
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d5254df-e731-4a6a-bd40-7ec91e97a387
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4d5254df-e731-4a6a-bd40-7ec91e97a387"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-4da172fb-5e04-4a7f-8181-3495f72be133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4da172fb-5e04-4a7f-8181-3495f72be133
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 25 Oct 2026 07:40:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4da172fb-5e04-4a7f-8181-3495f72be133
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4da172fb-5e04-4a7f-8181-3495f72be133"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb65445f-6b2f-4260-9627-a5282e2d6d66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb65445f-6b2f-4260-9627-a5282e2d6d66
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb65445f-6b2f-4260-9627-a5282e2d6d66
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb65445f-6b2f-4260-9627-a5282e2d6d66"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d184a14-1edd-4a88-b418-17fa65635686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d184a14-1edd-4a88-b418-17fa65635686
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d184a14-1edd-4a88-b418-17fa65635686
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2d184a14-1edd-4a88-b418-17fa65635686"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb01bc02-421f-4ed7-847e-b273ee63f22d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb01bc02-421f-4ed7-847e-b273ee63f22d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb01bc02-421f-4ed7-847e-b273ee63f22d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cb01bc02-421f-4ed7-847e-b273ee63f22d"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a83b36a-f860-42f7-983a-0966e5231809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a83b36a-f860-42f7-983a-0966e5231809
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a83b36a-f860-42f7-983a-0966e5231809
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4a83b36a-f860-42f7-983a-0966e5231809"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffff82d2-7bdb-4798-bf6c-2230b2ab7a01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffff82d2-7bdb-4798-bf6c-2230b2ab7a01
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffff82d2-7bdb-4798-bf6c-2230b2ab7a01
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ffff82d2-7bdb-4798-bf6c-2230b2ab7a01"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-616f63e8-9aac-4387-8b99-e3e080707baf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-616f63e8-9aac-4387-8b99-e3e080707baf
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-616f63e8-9aac-4387-8b99-e3e080707baf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-616f63e8-9aac-4387-8b99-e3e080707baf"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a21499c-3d39-48e9-b36a-bf2d4e853b24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a21499c-3d39-48e9-b36a-bf2d4e853b24
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a21499c-3d39-48e9-b36a-bf2d4e853b24
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

{"id":"acc_499428e8-30eb-47e5-a8ec-32682bac5e33","handle":"qa-fa3b3d83275b","displayName":"QA fa3b3d83275b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.802600725Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-4108a5ef-0b1c-400d-830c-d0dcd41e72c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4108a5ef-0b1c-400d-830c-d0dcd41e72c6
Content-Type: application/json

--- request body ---
{"handle":"qa-5f553f17f138","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4108a5ef-0b1c-400d-830c-d0dcd41e72c6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f32cd27-31b2-4276-b4d7-73e8d6726570"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0895f47d-0ed9-4f27-8534-73c552a74ad9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0895f47d-0ed9-4f27-8534-73c552a74ad9
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0895f47d-0ed9-4f27-8534-73c552a74ad9
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
correlation: qa-6b6f22f0-6a5c-4283-8406-c67258133cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6f22f0-6a5c-4283-8406-c67258133cb7
Content-Type: application/json

--- request body ---
{"handle":"qa-5f553f17f138","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b6f22f0-6a5c-4283-8406-c67258133cb7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b6f22f0-6a5c-4283-8406-c67258133cb7"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-960f5336-c1f7-481d-ac12-c40ecd096c2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-960f5336-c1f7-481d-ac12-c40ecd096c2c
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-960f5336-c1f7-481d-ac12-c40ecd096c2c
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
correlation: qa-106b9405-08ba-4576-86d3-6af63a8e3e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-106b9405-08ba-4576-86d3-6af63a8e3e7f
Content-Type: application/json

--- request body ---
{"handle":"qa-fa3b3d83275b","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-106b9405-08ba-4576-86d3-6af63a8e3e7f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-106b9405-08ba-4576-86d3-6af63a8e3e7f"}
```
